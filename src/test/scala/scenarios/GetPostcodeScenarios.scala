package scenarios

import requests.GetPostcodesRequests
import io.gatling.core.Predef.scenario
import io.gatling.core.structure.ScenarioBuilder


object GetPostcodeScenarios {
  val getPostcodesScenario: ScenarioBuilder = scenario (scenarioName = "Get postcodes scenario")
    .exec(GetPostcodesRequests.get_postcodes)
}
