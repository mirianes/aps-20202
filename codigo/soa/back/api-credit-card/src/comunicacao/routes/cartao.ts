import express = require('express')
import { CartaoEntity } from '../../dados/entidade/cartao'
const credit = express()

import ControladorCartao from '../controlador/cartao'

credit.post('/verifyCreditCard', (req, res) => {
    const card = JSON.parse(req.body.card)
    
    const numero = card.numero
    const validade = card.validade
    const codigoSeguranca = card.codigoSeguranca

    const cartao = new CartaoEntity(numero, validade, codigoSeguranca)
    const controladorCartao = new ControladorCartao()

    const errorMessage = controladorCartao.fachada.validate(cartao)

    if(errorMessage) {
        res.status(500).send(errorMessage)
    } else {
        res.status(200).send('Cartão OK')
    }
})

export {
    credit
}