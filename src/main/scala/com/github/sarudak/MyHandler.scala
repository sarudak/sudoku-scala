package com.github.sarudak

import org.scalatra._

/**
  * Created by seth on 2/20/16.
  */
class MyHandler extends ScalatrafreshStack {
  get("/") {
    <html>
      <body>
        <h1>Hello, world!</h1>
        Say <a href="hello-scalate">hello to Scalate</a>.
      </body>
    </html>
  }
}
