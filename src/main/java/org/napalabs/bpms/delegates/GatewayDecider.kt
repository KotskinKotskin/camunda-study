package org.napalabs.bpms.delegates

import org.camunda.bpm.engine.delegate.DelegateExecution
import org.camunda.bpm.engine.delegate.JavaDelegate
import org.springframework.stereotype.Component


@Component("gatewayDecider")
class GatewayDecider: JavaDelegate {
    override fun execute(p0: DelegateExecution?) {
        TODO("Not yet implemented")
    }
    fun decide(execution: DelegateExecution): Boolean {
        println(execution.getVariable("name"))

        return true
    }
}