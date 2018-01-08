package com.github.dapeng.soa.scala

import com.github.dapeng.core._;
        import com.github.dapeng.org.apache.thrift._;
        import java.util.ServiceLoader;
        import java.util.concurrent.CompletableFuture;
        import com.github.dapeng.soa.scala.CalculateServiceAsyncCodec._;
        import com.github.dapeng.soa.scala.service.CalculateServiceAsync;
        import scala.compat.java8.FutureConverters._
        import scala.concurrent.duration._
        import scala.concurrent.Future
        import scala.concurrent.ExecutionContext.Implicits.global

        /**
         * Autogenerated by Dapeng-Code-Generator (1.2.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated

        **/
        class CalculateServiceAsyncClient extends CalculateServiceAsync {

        val serviceName = "com.github.dapeng.soa.service.CalculateService"
        val version = "1.0.0"
        val pool = {
          val serviceLoader = ServiceLoader.load(classOf[SoaConnectionPoolFactory])
          if (serviceLoader.iterator().hasNext) {
            val poolImpl = serviceLoader.iterator().next().getPool
            poolImpl.registerClientInfo(serviceName,version)
            poolImpl
          } else null
        }

        def getServiceMetadata: String = {
          pool.send(
          serviceName,
          version,
          "getServiceMetadata",
          new getServiceMetadata_args,
          new GetServiceMetadata_argsSerializer,
          new GetServiceMetadata_resultSerializer
          ).success
        }


        

            /**
            * 
            **/
            def calcualteWordCount(filename:String ,word:String 
            , timeout: Long = 5000) : Future[Int] = {

            val response = pool.sendAsync(
            serviceName,
            version,
            "calcualteWordCount",
            calcualteWordCount_args(filename,word),
            new CalcualteWordCount_argsSerializer(),
            new CalcualteWordCount_resultSerializer()
            ,timeout).asInstanceOf[CompletableFuture[calcualteWordCount_result]]

            toScala(response).map(_.success)

          }

          

            /**
            * 
            **/
            def calcualteWordsCount(fileName:String 
            , timeout: Long = 5000) : Future[Map[String, Int]] = {

            val response = pool.sendAsync(
            serviceName,
            version,
            "calcualteWordsCount",
            calcualteWordsCount_args(fileName),
            new CalcualteWordsCount_argsSerializer(),
            new CalcualteWordsCount_resultSerializer()
            ,timeout).asInstanceOf[CompletableFuture[calcualteWordsCount_result]]

            toScala(response).map(_.success)

          }

          
      }
      