package com.dvarelap.base.rest

import org.scalatra.ScalatraServlet
import grizzled.slf4j.Logging
import org.scalatra.scalate.ScalateSupport

class FirstController extends ScalatraServlet with ScalateSupport with Logging {

    get("/") {

        contentType = "text/html"
        jade("index")
    }
}
