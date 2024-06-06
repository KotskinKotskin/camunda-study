package org.napalabs.bpms.delegates

import org.camunda.bpm.engine.delegate.DelegateExecution
import org.camunda.bpm.engine.delegate.JavaDelegate
import org.springframework.stereotype.Component


@Component("setArrayDelegate")
class SetArrayDelegate: JavaDelegate {
    override fun execute(execution: DelegateExecution) {
        var arr = mutableListOf<String>("hi","bonjour","привет","konichiwa")
        execution.setVariable("demoArray", arr)
    }

}