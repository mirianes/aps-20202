import Vue from 'vue'
import App from './App.vue'
import Router from 'vue-router'
import { BootstrapVue, IconsPlugin } from 'bootstrap-vue'

import router from './routes/index.js'
import store from './store.js'

import 'bootstrap/dist/css/bootstrap.css'
import 'bootstrap-vue/dist/bootstrap-vue.css'

Vue.use(BootstrapVue)

Vue.use(IconsPlugin)

Vue.use(Router)

Vue.config.productionTip = false

new Vue({
  router,
  store,
  render: h => h(App),
}).$mount('#app')
