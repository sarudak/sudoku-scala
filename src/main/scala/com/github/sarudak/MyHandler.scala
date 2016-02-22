package com.github.sarudak

import org.scalatra._
import org.json4s.{DefaultFormats, Formats}
import org.scalatra.json._

/**
  * Created by seth on 2/20/16.
  */
class MyHandler extends ScalatrafreshStack with JacksonJsonSupport{

  protected implicit lazy val jsonFormats: Formats = DefaultFormats

  before() {
    contentType = formats("json")
  }

  get("/") {
    contentType = formats("html")
    <html>
      <body>
        <h1>Hello, world!</h1>
        Say <a href="hello-scalate">hello to Scalate</a>.
      </body>
    </html>
  }

  get("/easy-start-board")
  {
    Vector(
      Vector(0, 0, 6, 0, 0, 7, 3, 0, 0),
      Vector(0, 1, 8, 0, 0, 9, 0, 5, 0),
      Vector(5, 0, 0, 0, 0, 0, 0, 6, 4),
      Vector(9, 2, 0, 0, 8, 0, 0, 0, 0),
      Vector(0, 0, 0, 7, 6, 3, 0, 0, 0),
      Vector(0, 0, 0, 0, 9, 0, 0, 7, 5),
      Vector(6, 3, 0, 0, 0, 0, 0, 0, 8),
      Vector(0, 9, 0, 3, 0, 0, 5, 2, 0),
      Vector(0, 0, 2, 4, 0, 0, 6, 0, 0))
  }
}

