package org.napalabs.bpms.delegates

import org.camunda.bpm.engine.delegate.DelegateExecution
import org.camunda.bpm.engine.delegate.JavaDelegate
import org.springframework.stereotype.Component


@Component("sendMessageDelegate")
class SendMessageDelegate: JavaDelegate {
    override fun execute(execution: DelegateExecution) {

        execution.processEngineServices.runtimeService
            .createMessageCorrelation("Message_2uecfk9").startMessageOnly().setVariables(mapOf("hi" to execution.getVariable(("name")))).correlate()
    }
}