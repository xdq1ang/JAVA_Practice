## 房屋出租系统框架图（分层模式）
1. 系统有哪些类（文件）
2. 明确类与类之间的调用关系

```plantuml
class HouseView{
1. 显示界面
2. 接收用户输入
3. 调用其他类完成对房屋信息的各种操作
}

class HouseService{
1.响应HouseView的调用
2. 完成对房屋信的各种操作（增删改查，crud）
}
class HouseRentApp{
//是程序的入口
1. 创建HouseView对象
2. 调用该对象，显示主菜单
}

class House{
1. 一个House对象表示一个房屋信息
}
HouseRentApp-->HouseView
HouseView-->HouseService
House<--HouseService
```
1. HouseView是界面
2. HouseService是业务层
3. House是domain/model
