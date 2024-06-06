package org.napalabs.bpms.delegates

import org.camunda.bpm.engine.delegate.DelegateExecution
import org.camunda.bpm.engine.delegate.JavaDelegate
import org.springframework.stereotype.Component

@Component("sendEndEventMessage")
class SendEndEventMessage: JavaDelegate {
    override fun execute(execution: DelegateExecution) {

        execution.processEngineServices.runtimeService
            .createMessageCorrelation("Message_29iac2r").processInstanceVariablesEqual(
                mapOf("name" to "Denis")
            ).correlate()
    }
}