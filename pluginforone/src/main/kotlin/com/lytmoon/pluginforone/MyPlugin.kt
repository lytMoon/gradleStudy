package com.lytmoon.pluginforone

import org.gradle.api.Plugin
import org.gradle.api.Project

class MyPlugin : Plugin<Project> {
  override fun apply(project: Project) {
    println("hahahahahahah lalalallal")
    project.tasks.register("hello") {
      it.doLast {
        println("Hello from MyKotlinPlugin!")
      }
    }


  }
}