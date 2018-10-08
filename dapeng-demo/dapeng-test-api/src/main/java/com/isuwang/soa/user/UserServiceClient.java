package com.isuwang.soa.user;

      import com.github.dapeng.core.*;
      import com.github.dapeng.org.apache.thrift.*;
      import java.util.ServiceLoader;
      import com.isuwang.soa.user.UserServiceCodec.*;
      import com.isuwang.soa.user.service.UserService;

      /**
       * Autogenerated by Dapeng-Code-Generator (2.1.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated

      **/
      public class UserServiceClient implements UserService{
      private final String serviceName;
      private final String version;

      private SoaConnectionPool pool;

      public UserServiceClient() {
        this.serviceName = "com.isuwang.soa.user.service.UserService";
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
            
              public void createUser(com.isuwang.soa.user.domain.User user) throws SoaException{

              String methodName = "createUser";

              createUser_args createUser_args = new createUser_args();
              createUser_args.setUser(user);
                

              createUser_result response = pool.send(serviceName,version,"createUser",createUser_args, new CreateUser_argsSerializer(), new CreateUser_resultSerializer());

              
                  
                
            }
            
          

        
          
            /**
            * 
            **/
            
              public com.isuwang.soa.user.domain.User getUserById(Integer userId) throws SoaException{

              String methodName = "getUserById";

              getUserById_args getUserById_args = new getUserById_args();
              getUserById_args.setUserId(userId);
                

              getUserById_result response = pool.send(serviceName,version,"getUserById",getUserById_args, new GetUserById_argsSerializer(), new GetUserById_resultSerializer());

              
                  
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
    