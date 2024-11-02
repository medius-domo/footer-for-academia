package cxx

import io.ktor.server.application.*
import io.ktor.server.cio.*
import io.ktor.server.engine.*
import io.ktor.server.html.*
import io.ktor.server.http.content.*
import io.ktor.server.routing.*
import kotlinx.html.*
fun main(){
    embeddedServer(CIO, 8080){
        module()
    }.start(wait = true)
}

fun Application.module(){
    val styles=Styles
    routing {
        stylesheets()
        static("/static"){
            resources("static")
        }
        get("/"){
            call.respondHtml {
                head{
                    meta {name="viewport"; content="width=device-width, initial-scale=1.0" }
                    title{+"Footer"}
                    link (styles)
                    style {
                        unsafe {
                            raw(
                                """
                @font-face {
                    font-family: "Markpro";
                    font-weight: normal;
                    src:url("/static/font/MARKPRO.OTF");
                }
                @font-face {
                    font-family: "Markpro";
                    font-weight: bold;
                    src:url("/static/font/MARKPROBOLD.OTF");
                }
                @font-face {
                    font-family: "Markpro";
                    font-weight: 900;
                    src:url("/static/font/MARKPROHEAVY.OTF");
                }
                @font-face {
                    font-family: "Markpro";
                    font-weight: 500;
                    src:url("/static/font/MARKPROMEDIUM.OTF");
                }

            """
                            )
                        }
                    }
                }
                body {
                    div (classes= styles.footer){
                            div (classes = styles.footercontent){
                                div (classes = styles.academiabland){
                                    div (classes = styles.academialogo){
                                           img { src ="static/images/Academia Logo.svg"; alt ="logo" }
                                    }
                                    div (classes = styles.sometexts){
                                        div(classes=Styles.sometextsp){
                                            p{
                                                +"is a cutting-edge school management system designed to"
                                                br{}
                                                +"simplify and enhance the educational experience for"
                                                br{}
                                                +"administrators, teachers, parents and students"
                                            }
                                        }
                                    }


                                }
                                div (classes = styles.links){
                                    ul {
                                        h4 { +"Quick Links" }
                                        li { a(href ="#") {+"Features"} }
                                        li { a(href ="#"){+"Support" }}
                                        li {a(href ="#"){ +"Brand Center" }}
                                        li {a(href ="#"){ +"FAQ" }}
                                        li {a(href ="#"){ +"How it Works" }}
                                        li { a(href ="#"){+"Blog" }}
                                        li { a(href ="#"){+"About" }}
                                    }


                                    ul {
                                        h4{+"Informational"}
                                        li { a(href ="#"){+"Download Android App" }}
                                        li { a(href ="#"){+"Download iOS App" }}
                                        li {a(href ="#"){ +"Terms of services" }}
                                        li {a(href ="#"){ +"Privacy Policy" }}
                                        li { a(href ="#"){+"Cookies Settings" }}
                                    }


                                    ul {
                                        h4 { +"Contact Info" }
                                        li { a(href ="#"){+"Support@academia.com" }}
                                        li { a(href ="#"){+"+255 687 122 502" }}

                                    }
                                }
                            }
                           div(classes=styles.horizontalline){
                               hr {  }
                           }
                            div (classes = styles.bottomlinks){
                                div(classes = Styles.bottomtexts){ +"© 2024 Academia. All rights reserved" }
                                div(classes = styles.bottomtextsp){ a(href ="#"){+"Powered By aSoft" }}
                                div(classes = styles.social){
                                    span {
                                        a(href = "#") {
                                            img(src = "static/images/linkedin-icon.svg", alt = "linkedin",classes = styles.socialicon)
                                        }
                                    }
                                    span {
                                        a(href = "#") {
                                            img(src = "static/images/ticktock-icon.svg", alt = "ticktock",classes = styles.socialicon)
                                        }
                                    }
                                    span {
                                        a(href = "#") {
                                            img(src = "static/images/facebook-icon.svg", alt = "facebook",classes = styles.socialicon)
                                        }
                                    }
                                    span {
                                        a(href = "#") {
                                            img(src = "static/images/instagram-icon.svg", alt = "instagram",classes = styles.socialicon)
                                        }
                                    }
                                    span {
                                        a(href = "#") {
                                            img(src = "static/images/Twitter-icon.svg", alt = "Twitter",classes = styles.socialicon)
                                        }
                                    }
                                }
                            }
                    }
                }
            }
        }
    }
}