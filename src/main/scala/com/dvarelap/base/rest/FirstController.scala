package com.dvarelap.base.rest

import com.dvarelap.core.rest.JsonControllerSupport

case class Data(id: Long = 1, name: String = "Some text")

class FirstController extends JsonControllerSupport {

    get("/:id") {
        Data()
    }
}
