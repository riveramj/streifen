package me.frmr.stripe

import net.liftweb.json._
  import JsonDSL._
import net.liftweb.util.Helpers._

class Coupon(underlyingData: JValue) extends StripeObject(underlyingData)