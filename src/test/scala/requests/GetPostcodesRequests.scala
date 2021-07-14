package requests

import config.Configuration.{baseUrl, bodyFilepath}
import io.gatling.core.scenario.Simulation
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.http.request.builder.HttpRequestBuilder

import scala.language.postfixOps


object GetPostcodesRequests {


  var get_postcodes: HttpRequestBuilder = http( requestName = "Get Postcodes")
    .post(baseUrl + "/postcodes")
    .body (RawFileBody(filePath = bodyFilepath)).asJson
    .header( name = "content-type", value= "application/json")
    .check(status is 200)
}
