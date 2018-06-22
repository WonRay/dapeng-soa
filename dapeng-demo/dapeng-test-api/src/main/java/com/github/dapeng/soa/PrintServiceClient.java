package com.github.dapeng.soa;

      import com.github.dapeng.core.*;
      import com.github.dapeng.org.apache.thrift.*;
      import java.util.ServiceLoader;
      import com.github.dapeng.soa.PrintServiceCodec.*;
      import com.github.dapeng.soa.service.PrintService;

      /**
       * Autogenerated by Dapeng-Code-Generator (2.0.5)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated

      **/
      public class PrintServiceClient implements PrintService{
      private final String serviceName;
      private final String version;

      private SoaConnectionPool pool;

      public PrintServiceClient() {
        this.serviceName = "com.github.dapeng.soa.service.PrintService";
        this.version = "1.0.0";

        ServiceLoader<SoaConnectionPoolFactory> factories = ServiceLoader.load(SoaConnectionPoolFactory.class);
        for (SoaConnectionPoolFactory factory: factories) {
          this.pool = factory.getPool();
          break;
        }
        this.pool.registerClientInfo(serviceName,version);
      }

      
          
            /**
            * 
            **/
            
              public void print() throws SoaException{

              String methodName = "print";

              print_args print_args = new print_args();
              

              print_result response = pool.send(serviceName,version,"print",print_args, new Print_argsSerializer(), new Print_resultSerializer());

              
                  
                
            }
            
          

        
          
            /**
            * 
            **/
            
              public String printInfo(com.github.dapeng.soa.domain.Info info) throws SoaException{

              String methodName = "printInfo";

              printInfo_args printInfo_args = new printInfo_args();
              printInfo_args.setInfo(info);
                

              printInfo_result response = pool.send(serviceName,version,"printInfo",printInfo_args, new PrintInfo_argsSerializer(), new PrintInfo_resultSerializer());

              
                  
                      return response.getSuccess();
                    
                
            }
            
          

        
          
            /**
            * 
            **/
            
              public String printInfo2(String name) throws SoaException{

              String methodName = "printInfo2";

              printInfo2_args printInfo2_args = new printInfo2_args();
              printInfo2_args.setName(name);
                

              printInfo2_result response = pool.send(serviceName,version,"printInfo2",printInfo2_args, new PrintInfo2_argsSerializer(), new PrintInfo2_resultSerializer());

              
                  
                      return response.getSuccess();
                    
                
            }
            
          

        
          
            /**
            * 
            **/
            
              public String printInfo3() throws SoaException{

              String methodName = "printInfo3";

              printInfo3_args printInfo3_args = new printInfo3_args();
              

              printInfo3_result response = pool.send(serviceName,version,"printInfo3",printInfo3_args, new PrintInfo3_argsSerializer(), new PrintInfo3_resultSerializer());

              
                  
                      return response.getSuccess();
                    
                
            }
            
          

        

      /**
      * getServiceMetadata
      **/
      public String getServiceMetadata() throws SoaException {
        String methodName = "getServiceMetadata";
        getServiceMetadata_args getServiceMetadata_args = new getServiceMetadata_args();
        getServiceMetadata_result response = pool.send(serviceName,version,methodName,getServiceMetadata_args, new GetServiceMetadata_argsSerializer(), new GetServiceMetadata_resultSerializer());
        return response.getSuccess();
      }

    }
    