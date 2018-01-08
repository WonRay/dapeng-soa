package com.github.dapeng.soa.account.scala.enums

class TAccountApplyType private(val id: Int, val name: String) extends com.github.dapeng.core.enums.TEnum(id,name) {}

      /**
       * Autogenerated by Dapeng-Code-Generator (1.2.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated

      * 

 申请类型

      **/
      object TAccountApplyType {

      
            val Withdrawals = new TAccountApplyType(1, "提现")
          
            val Recharge = new TAccountApplyType(2, "充值")
          
      val UNDEFINED = new TAccountApplyType(-1,"UNDEFINED") // undefined enum
      

      def findByValue(v: Int): TAccountApplyType = {
        v match {
          case 1 => Withdrawals
            case 2 => Recharge
            
          case _ => new TAccountApplyType(v,"#"+ v)
        }
      }

      def apply(v: Int) = findByValue(v)
      def unapply(v: TAccountApplyType): Option[Int] = Some(v.id)

    }
    