import com.dvarelap.base.rest.FirstController
import javax.servlet.ServletContext
import org.scalatra.LifeCycle
import grizzled.slf4j.Logging

class ScalatraBootstrap extends LifeCycle with Logging {

    val PREFIX = ""


    override def init(context: ServletContext) {
        context mount (new FirstController, "/*")
        logger warn "DirtyDan"
    }

    override def destroy(context: ServletContext) {
    }
}
