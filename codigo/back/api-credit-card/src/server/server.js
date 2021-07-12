const { PORT } = require("../config/config")
const { credit } = require("../routes/credit")

const port = PORT

const express = require('express')
const app = express()

function server() {
    app.use(credit)

    app.listen(port, () => {
    console.log(`Example app listening at http://localhost:${port}`)
    })
}

module.exports = {
    server
}