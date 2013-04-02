package com.dvarelap.base.rest

import com.dvarelap.core.rest.JsonControllerSupport

class FirstController extends JsonControllerSupport {
    case class Perro(id: Long = 1, name: String = "Fido")

    get("/") {
        Perro()
    }
}
