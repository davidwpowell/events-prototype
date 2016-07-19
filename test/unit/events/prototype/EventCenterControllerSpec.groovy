package events.prototype

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(EventCenterController)
class EventCenterControllerSpec extends Specification {

    void "Test controller"() {
        controller.index
        assert 'Events' == response.text
    }
}
