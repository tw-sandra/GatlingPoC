package simulations

import io.gatling.core.Predef._
import io.gatling.core.scenario.Simulation
import scenarios.GetPostcodeScenarios

import scala.concurrent.duration._
import scala.language.postfixOps

class GetPostcodesSimulation extends Simulation{

  private val getPostcodesRampExec = GetPostcodeScenarios.getPostcodesScenario
    .inject(rampUsers(1) during(1 seconds))

  setUp(getPostcodesRampExec)
      .assertions (global.responseTime.max.lt( threshold= 5000))
}
