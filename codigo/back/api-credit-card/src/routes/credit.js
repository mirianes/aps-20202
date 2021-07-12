const express = require('express')
const credit = express()

credit.post('/payCreditCard', (req, res) => {
    res.send('Pagamento recebido')
})

module.exports = {
    credit
}