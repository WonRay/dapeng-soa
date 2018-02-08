
        package com.github.dapeng.basic.api.counter.service;

        import com.github.dapeng.core.Processor;
        import com.github.dapeng.core.Service;
        import com.github.dapeng.core.SoaGlobalTransactional;

        import java.util.concurrent.Future;

        /**
         * Autogenerated by Dapeng-Code-Generator (1.2.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated

        * 
        **/
        @Service(name="com.github.dapeng.basic.api.counter.service.CounterService",version = "1.0.0")
        @Processor(className = "com.github.dapeng.basic.api.counter.CounterServiceAsyncCodec$Processor")
        public interface CounterServiceAsync  extends com.github.dapeng.core.definition.AsyncService {
        
            /**
            * 
            **/
            
            
              Future<Void> submitPoint( com.github.dapeng.basic.api.counter.domain.DataPoint dataPoint , long timeout) throws com.github.dapeng.core.SoaException;
            
          
            /**
            * 
            **/
            
            
              Future<Void> submitPoints( java.util.List<com.github.dapeng.basic.api.counter.domain.DataPoint> dataPoints , long timeout) throws com.github.dapeng.core.SoaException;
            
          
            /**
            * 
            **/
            
            
              Future<java.util.List<com.github.dapeng.basic.api.counter.domain.DataPoint>> queryPoints( com.github.dapeng.basic.api.counter.domain.DataPoint condition, String beginTimeStamp, String endTimeStamp , long timeout) throws com.github.dapeng.core.SoaException;
            
          
      }
      