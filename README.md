# gmall中的项目说明


##### gmall_parent 所有项目中共性的抽取，主要负责项目中jar版本的控制以及项目的整合
##### gmall_api 主要存放项目中所用的实体类和接口
##### gmall_util的拆分
      gmall_common: 前后台公共的工具项目
      gmall_service_util: 主要负责后台的工具项目
      gmall_web_util: 主要负责web前台的工具项目

##### gmall_user的拆分
      原user项目做了具体的拆分： 项目已经作废 端口为8001
      gmall_user_service port:8881  主要用于后台服务
      gmall_user_web     port:8882  主要用于前台服务
      

##### gmall_manage  主要是商品管理项目
      gmall_manage_service port=8871  主要负责商品管理的后端开发
      gamll_manage_web     port=8872  主要负责商品管理的开端开发
      