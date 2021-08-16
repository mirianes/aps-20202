import Vue from 'vue'
import Router from 'vue-router'
import { BootstrapVue, BootstrapVueIcons } from 'bootstrap-vue'

import Pet from '../pages/Pet/PetPage'
import Comanda from '../pages/Comanda/ComandaPage'

Vue.use(Router)
Vue.use(BootstrapVue)
Vue.use(BootstrapVueIcons)

const routes = [
    {
        name: 'Pet',
        path: '/pet',
        component: Pet
    },
    {
        name: 'Comanda',
        path: '/comanda',
        component: Comanda
    }
]

const router = new Router({ routes })

export default router