import { PORT } from "../config/config"
import { credit } from "../routes/cartao"

const port = PORT

import express = require('express')

import bodyParser = require('body-parser')
const app = express()

function server() {
    app.use(bodyParser.json())
    app.use(bodyParser.urlencoded({ extended: false}))
    app.use(credit)

    app.listen(port, () => {
        console.log(`Example app listening at http://localhost:${port}`)
    })
}

export {
    server
}