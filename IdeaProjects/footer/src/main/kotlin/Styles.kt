package cxx

import io.ktor.http.LinkHeader.Parameters.Media
import kotlinx.css.*
import kotlinx.css.properties.TextDecoration
import kotlinx.css.properties.TextDecorationLine
import javax.print.attribute.standard.Media
import javax.swing.text.StyledEditorKit.FontFamilyAction
import javax.swing.text.StyledEditorKit.FontSizeAction

internal object Styles : StyleSheet() {
   /* val body by classname{
        fontFace {
            fontFamily= "Markpro"
            fontWeight=  FontWeight.normal
            src = "url(/static/font/MARKPRO.OTF)"
        }
        fontFace {
            fontFamily = "Markpro"
            fontWeight= FontWeight.bold
            src= "url(/static/font/MARKPROBOLD.OTF)"
        }
        fontFace {
            fontFamily= "Markpro"
            fontWeight= FontWeight.w900
            src= "url(/static/font/MARKPROHEAVY.OTF)"
        }
        fontFace {
            fontFamily= "Markpro"
            fontWeight= FontWeight.w500
            src="url(/static/font/MARKPROMEDIUM.OTF)"
        }
    }*/
    val academiabland by classname{
        height= LinearDimension.auto
        backgroundColor=Color.transparent
        display=Display.flex
        justifyContent=JustifyContent.center
        alignItems=Align.center
        flexDirection=FlexDirection.column

        media(extraSmallDevices){
            width=100.pct
            height=30.pct
            display=Display.flex
            flexDirection=FlexDirection.column
            justifyContent=JustifyContent.center
            alignItems=Align.center
        }
        media(smallDevices.toString()){
            width=100.pct
            height=30.pct
            display=Display.flex
            flexDirection=FlexDirection.column
            justifyContent=JustifyContent.center
            alignItems=Align.center
        }
       media(onlyScreenMinWidth(576.px)){
           width=50.pct
           height=30.pct
           display=Display.flex
           flexDirection=FlexDirection.column
           justifyContent=JustifyContent.center
           alignItems=Align.center
       }

        media(onlyScreenMinWidth(768.px)){
            width=50.pct
            height=30.pct
            display=Display.flex
            flexDirection=FlexDirection.column
            justifyContent=JustifyContent.center
            alignItems=Align.center
        }
        media(onlyScreenMinWidth(992.px)){
            width=50.pct
            height=30.pct
            display=Display.flex
            flexDirection=FlexDirection.column
            justifyContent=JustifyContent.center
            alignItems=Align.center
        }

    }
    val footer by classname {
        width=100.pct
        height= LinearDimension.auto
        backgroundColor= Color.aliceBlue
        display=Display.flex
        flexDirection=FlexDirection.column
        alignItems=Align.center
        justifyContent=JustifyContent.center
        listStyleType=ListStyleType.none

        media(extraSmallDevices){
            backgroundColor=Color.aliceBlue
            width=100.pct
            height= LinearDimension.auto
            display=Display.flex
            flexDirection=FlexDirection.column
            alignItems=Align.center
            justifyContent=JustifyContent.spaceEvenly
        }

        media(smallDevices.toString()){
            backgroundColor=Color.aliceBlue
            width=100.pct
            height= LinearDimension.auto
            display=Display.flex
            flexDirection=FlexDirection.column
            alignItems=Align.center
            justifyContent=JustifyContent.spaceEvenly
        }
        media(onlyScreenMinWidth(768.px)){
            backgroundColor=Color.aliceBlue
            width=100.pct
            height= LinearDimension.auto
            display=Display.flex
            flexDirection=FlexDirection.column
            alignItems=Align.center
            justifyContent=JustifyContent.spaceEvenly
        }
        media(onlyScreenMinWidth(992.px)){
            backgroundColor=Color.aliceBlue
            width=100.pct
            display=Display.flex
            flexDirection=FlexDirection.column
            alignItems=Align.center
            justifyContent=JustifyContent.spaceEvenly
        }
    }
    val footercontent by classname {
       display=Display.flex
        width=90.pct
        height=80.pct

        media(extraSmallDevices){
        width=100.pct
        height= LinearDimension.auto
        display=Display.flex
        flexDirection=FlexDirection.column
        }
        media(smallDevices.toString()){
            width=100.pct
            height= LinearDimension.auto
            display=Display.flex
            flexDirection=FlexDirection.column
        }
        media(onlyScreenMinWidth(768.px)){
            width=100.pct
            height= LinearDimension.auto
            display=Display.flex
            flexDirection=FlexDirection.column
        }
        media(onlyScreenMinWidth(992.px)){
            width=100.pct
            height= LinearDimension.auto
            display=Display.flex
            flexDirection=FlexDirection.row
        }
    }

    val academialogo by classname {
        width=100.pct
        height= LinearDimension.auto
        display=Display.flex
        justifyContent=JustifyContent.flexStart
        gap=0.1.rem

        "img" {
           // height=50.pct
           // width= LinearDimension.auto
        }

        media(extraSmallDevices){
            width=100.pct
            display=Display.flex
            justifyContent=JustifyContent.center
            alignItems=Align.center
            marginTop=20.px
            marginBottom=20.px
            backgroundColor=Color.transparent
            "img" {
                height=50.pct
                width= LinearDimension.auto
            }
        }

        media(smallDevices.toString()){
            width=100.pct
            display=Display.flex
            justifyContent=JustifyContent.center
            alignItems=Align.center
            marginTop=20.px
            marginBottom=20.px
            backgroundColor=Color.transparent
            "img" {
                height=50.pct
                width= LinearDimension.auto
            }
        }
        media(onlyScreenMinWidth(576.px)){
            width=50.pct
            display=Display.flex
            justifyContent=JustifyContent.center
            alignItems=Align.center
            marginTop=20.px
            marginBottom=20.px
            backgroundColor=Color.transparent

            "img"{
                height=30.pct
                width=80.pct
            }
        }
        media(onlyScreenMinWidth(768.px)){
            width=100.pct
            display=Display.flex
            justifyContent=JustifyContent.center
            alignItems=Align.center
            marginTop=20.px
            marginBottom=20.px
            backgroundColor=Color.transparent
            "img" {
                height=50.pct
                width= LinearDimension.auto
            }
        }
        media(onlyScreenMinWidth(992.px)){
            width=100.pct
            display=Display.flex
            justifyContent=JustifyContent.flexStart
            alignItems=Align.center
            marginTop=20.px
            marginBottom=20.px
            backgroundColor=Color.transparent
            "img" {
                height=50.pct
                width= LinearDimension.auto
            }
        }
    }
    val sometexts by classname {
        height=70.pct
        width=100.pct
        display=Display.flex
        justifyContent=JustifyContent.center
        alignItems=Align.start
        backgroundColor=Color.transparent
        fontFamily="Markpro"

        media(extraSmallDevices){
            width=100.pct
            display=Display.flex
            justifyContent=JustifyContent.center
            alignItems=Align.start
            marginBottom=20.px
        }
        media(smallDevices.toString()){
            width=100.pct
            display=Display.flex
            justifyContent=JustifyContent.center
            alignItems=Align.start
            marginBottom=20.px
        }
        media(onlyScreenMinWidth(768.px)){
            width=100.pct
            display=Display.flex
            justifyContent=JustifyContent.center
            alignItems=Align.start
            marginBottom=20.px
        }
        media(onlyScreenMinWidth(992.px)){
            width=100.pct
            display=Display.flex
            justifyContent=JustifyContent.flexStart
            alignItems=Align.start
            marginBottom=20.px
        }
    }

    val sometextsp by classname {
        fontSize=1.1.rem
        backgroundColor=Color.transparent
        color= Color.grey
        fontFamily="Markpro"

        media(extraSmallDevices){
            fontSize=0.8.rem
        }
        media(smallDevices.toString()){
            fontSize=1.1.rem
            fontWeight=FontWeight.w500
            backgroundColor=Color.transparent
        }
        media(onlyScreenMinWidth(678.px)){
            fontSize=1.1.rem
            backgroundColor=Color.transparent
        }
        media(onlyScreenMinWidth(992.px)){
            fontSize=1.1.rem
            backgroundColor=Color.transparent
        }
    }

    val links by classname {
       width=100.pct
        display=Display.flex
        height=100.pct
        backgroundColor= Color.aliceBlue
        justifyContent=JustifyContent.spaceEvenly
        alignItems=Align.flexStart
        listStyleType=ListStyleType.none
        fontSize=1.3.rem
        color=Color.grey
        fontFamily="Markpro"


        "ul"{
            height=100.pct
            fontFamily="Markpro"
        }
        "li" {
            paddingTop=1.rem
            listStyleType=ListStyleType.none
            fontSize=1.0.rem
            fontFamily="Markpro"
        }
        "a" {
            color=Color.black
            textDecoration= TextDecoration.none
            listStyleType=ListStyleType.none
            fontFamily="Markpro"
        }
        media(extraSmallDevices){
            width=100.pct
            display=Display.flex
            gap=0.2.rem
            flexDirection=FlexDirection.column
            justifyContent=JustifyContent.spaceEvenly
            alignItems=Align.flexStart
            height= LinearDimension.auto
            "ul"{
                padding= Padding(1.rem)
            }
        }
        media(smallDevices.toString()){
            width=100.pct
            display=Display.flex
            gap=0.2.rem
            flexDirection=FlexDirection.column
            justifyContent=JustifyContent.spaceEvenly
            alignItems=Align.flexStart
            height= LinearDimension.auto
            "ul"{
                padding= Padding(1.rem)
            }
        }
        media(onlyScreenMinWidth(768.px)){
            width=100.pct
            display=Display.flex
            gap=0.2.rem
            flexDirection=FlexDirection.row
            justifyContent=JustifyContent.spaceBetween
            alignItems=Align.flexStart
            height= LinearDimension.auto
            "ul"{
                padding= Padding(1.rem)
            }
        }
        media(onlyScreenMinWidth(576.px)){
            width=50.pct
            display=Display.flex
            gap=0.2.rem
            flexDirection=FlexDirection.row
            justifyContent=JustifyContent.spaceBetween
            alignItems=Align.flexStart
            height= LinearDimension.auto
            "ul"{
                padding= Padding(1.rem)
            }
        }

        media(onlyScreenMinWidth(992.px)){
            width=100.pct
            display=Display.flex
            gap=0.2.rem
            flexDirection=FlexDirection.row
            justifyContent=JustifyContent.spaceBetween
            alignItems=Align.flexStart
            height= LinearDimension.auto
        }
    }
    val bottomlinks by classname {
        display=Display.flex
        height=20.pct
        justifyContent=JustifyContent.spaceEvenly
        alignItems=Align.center
        width=100.pct
        padding=Padding(30.px)

        media(extraSmallDevices){
            width=100.pct
            backgroundColor=Color.transparent
            display=Display.flex
            flexDirection=FlexDirection.column
            height= LinearDimension.auto
            justifyContent=JustifyContent.spaceEvenly
            alignItems=Align.center
        }
        media(smallDevices.toString()){
            width=100.pct
            backgroundColor=Color.transparent
            display=Display.flex
            flexDirection=FlexDirection.column
            height= LinearDimension.auto
            justifyContent=JustifyContent.spaceEvenly
            alignItems=Align.center
        }
        media(onlyScreenMinWidth(768.px)){
            width=100.pct
            backgroundColor=Color.transparent
            display=Display.flex
            flexDirection=FlexDirection.row
            height= LinearDimension.auto
            justifyContent=JustifyContent.spaceEvenly
            alignItems=Align.center
        }
        media(onlyScreenMinWidth(992.px)){
            width=100.pct
            backgroundColor=Color.transparent
            display=Display.flex
            flexDirection=FlexDirection.row
            height= LinearDimension.auto
            justifyContent=JustifyContent.spaceEvenly
            alignItems=Align.center
        }
    }
    val  horizontalline by classname{
        media(extraSmallDevices){
            height= 2.px
            width=90.pct
            display=Display.flex
            flexDirection=FlexDirection.row
            backgroundColor= Color.skyBlue
        }
        media(smallDevices.toString()){
            height= 1.9.px
            width=90.pct
            display=Display.flex
            flexDirection=FlexDirection.row
            backgroundColor= Color.skyBlue
        }
        media(onlyScreenMinWidth(576.px)){
            height= 1.9.px
            width=90.pct
            display=Display.flex
            flexDirection=FlexDirection.row
            backgroundColor= Color.skyBlue
        }
        media(onlyScreenMinWidth(768.px)){
            height= 1.9.px
            width=90.pct
            display=Display.flex
            flexDirection=FlexDirection.row
            backgroundColor= Color.skyBlue
        }
        media(onlyScreenMinWidth(990.px)){
            height= 1.9.px
            width=90.pct
            display=Display.flex
            flexDirection=FlexDirection.row
            backgroundColor= Color.skyBlue
        }
        media(onlyScreenMinWidth(992.px)){
            height= 1.9.px
            width=90.pct
            display=Display.flex
            flexDirection=FlexDirection.row
            backgroundColor= Color.skyBlue
        }
    }
    val bottomtexts by classname {
        height=1.rem
        fontSize=1.1.rem
        display=Display.flex
        flexDirection=FlexDirection.column
        alignItems=Align.center
        fontFamily="Markpro"

        media(onlyScreenMaxWidth(575.98.px)){
            width=100.pct
            height=1.rem
            fontSize=1.rem
            display=Display.flex
            justifyContent=JustifyContent.center
            flexDirection=FlexDirection.column
            alignItems=Align.center
            padding= Padding(0.5.rem)
        }
        media(smallDevices.toString()){
            width=100.pct
            height=1.rem
            fontSize=1.rem
            display=Display.flex
            justifyContent=JustifyContent.center
            flexDirection=FlexDirection.column
            alignItems=Align.center
            padding= Padding(0.5.rem)
        }
        media(onlyScreenMinWidth(576.px)){
            width=65.pct
            height=1.rem
            fontSize=1.rem
            display=Display.flex
            justifyContent=JustifyContent.center
            flexDirection=FlexDirection.column
            alignItems=Align.center
            padding= Padding(0.5.rem)
        }
        media(onlyScreenMinWidth(768.px)){
            width=100.pct
            height=1.rem
            fontSize=0.8.rem
            display=Display.flex
            justifyContent=JustifyContent.center
            flexDirection=FlexDirection.column
            alignItems=Align.center
            padding= Padding(0.5.rem)
        }
        media(onlyScreenMinWidth(990.px)){
            width=45.pct
            height=1.rem
            fontSize=1.1.rem
            display=Display.flex
            justifyContent=JustifyContent.center
            flexDirection=FlexDirection.column
            alignItems=Align.center
            padding= Padding(0.5.rem)
        }
        media(onlyScreenMinWidth(992.px)){
            width=35.pct
            height=1.rem
            fontSize=1.rem
            display=Display.flex
            justifyContent=JustifyContent.center
            flexDirection=FlexDirection.column
            alignItems=Align.center
        }
    }
    val bottomtextsp by classname {
        display=Display.flex
        flexDirection=FlexDirection.row
        width=50.pct
        justifyContent=JustifyContent.center
        fontFamily="Markpro"
        "a" {
            color =Color.black
            fontSize=1.1.rem
        }

        media(extraSmallDevices){
            display=Display.flex
            flexDirection=FlexDirection.row
            width=100.pct
        }
        media(smallDevices.toString()){
            display=Display.flex
            flexDirection=FlexDirection.row
            width=100.pct
        }
        media(onlyScreenMinWidth(768.px)){
            display=Display.flex
            flexDirection=FlexDirection.row
            width=50.pct
        }
        media(onlyScreenMinWidth(992.px)){
            display=Display.flex
            flexDirection=FlexDirection.row
            width=40.pct
        }
    }
    val social by classname {
        height=1.rem
        fontSize=1.rem
        display=Display.flex
        justifyContent=JustifyContent.spaceEvenly
        flexDirection=FlexDirection.row
        padding=Padding(0.6.rem)

        media(extraSmallDevices){
            width=100.pct
            height=1.rem
            fontSize=1.rem
            display=Display.flex
            justifyContent=JustifyContent.spaceEvenly
            flexDirection=FlexDirection.row
            alignItems=Align.flexStart
            padding= Padding(0.6.rem)
        }
        media(smallDevices.toString()){
            width=100.pct
            height=1.rem
            fontSize=1.rem
            display=Display.flex
            justifyContent=JustifyContent.spaceEvenly
            flexDirection=FlexDirection.row
            alignItems=Align.flexStart
            padding= Padding(0.6.rem)
        }
        media(onlyScreenMinWidth(576.px)){
            width=30.pct
            height=1.rem
            fontSize=1.rem
            display=Display.flex
            justifyContent=JustifyContent.spaceEvenly
            flexDirection=FlexDirection.row
            alignItems=Align.flexStart
            padding= Padding(0.6.rem)
        }
        media(onlyScreenMinWidth(768.px)){
            width=40.pct
            height=1.rem
            fontSize=1.rem
            display=Display.flex
            justifyContent=JustifyContent.spaceEvenly
            flexDirection=FlexDirection.row
            alignItems=Align.flexStart
            padding= Padding(0.6.rem)
        }
        media(onlyScreenMinWidth(992.px)){
            width=25.pct
            height=1.rem
            fontSize=1.rem
            display=Display.flex
            justifyContent=JustifyContent.spaceEvenly
            flexDirection=FlexDirection.row
            alignItems=Align.flexStart
            padding= Padding(0.6.rem)
        }
    }
    val socialicon by classname {
        height=1.25.rem
    }
}