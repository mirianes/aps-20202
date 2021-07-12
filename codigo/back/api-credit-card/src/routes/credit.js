const express = require('express')
const credit = express()

credit.post('/payCreditCard', (req, res) => {
    res.send('Pagamanto recebido')
})

module.exports = {
    credit
}