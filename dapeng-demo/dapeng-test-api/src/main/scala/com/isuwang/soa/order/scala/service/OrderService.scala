
        package com.isuwang.soa.order.scala.service

        import com.github.dapeng.core.{Processor, Service}
        import com.github.dapeng.core.SoaGlobalTransactional

        /**
         * Autogenerated by Dapeng-Code-Generator (2.0.4)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated

        * 
        **/
        @Service(name ="com.isuwang.soa.order.service.OrderService" , version = "1.0.0")
        @Processor(className = "com.isuwang.soa.order.scala.OrderServiceCodec$Processor")
        trait OrderService {
        
            /**
            * 
            **/
            
            @throws[com.github.dapeng.core.SoaException]
            def createOrder(
            order: com.isuwang.soa.order.scala.domain.Order ): Unit

          
            /**
            * 
            **/
            
            @throws[com.github.dapeng.core.SoaException]
            def getOrderById(
            orderId: Int ): com.isuwang.soa.order.scala.domain.Order

          
      }
      