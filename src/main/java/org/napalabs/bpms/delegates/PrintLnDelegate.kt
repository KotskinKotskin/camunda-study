package org.napalabs.bpms.delegates

import org.camunda.bpm.engine.delegate.BpmnError
import org.camunda.bpm.engine.delegate.DelegateExecution
import org.camunda.bpm.engine.delegate.JavaDelegate
import org.springframework.stereotype.Component


@Component("printLnDelegate")
class PrintLnDelegate: JavaDelegate {
    override fun execute(execution: DelegateExecution) {
        var name = execution.getVariable("name") as String
        println("hello $name")
        throw BpmnError("NO_CDEK_DELIVERY")
    }
}