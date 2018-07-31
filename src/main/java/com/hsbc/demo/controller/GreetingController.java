package com.hsbc.demo.controller;
import com.hsbc.demo.entity.Food;
import com.hsbc.demo.entity.JsonModel;
import com.hsbc.demo.entity.Product;
import org.springframework.web.bind.annotation.*;


/**
 * @ClassName GreetingController
 * @Description
 * @Author Niki
 * @Date 2018/7/30 10:58
 * @Version 1.0
 **/
@RestController
@RequestMapping("/food/info")
public class GreetingController {

   @PostMapping("/add")
   public JsonModel addFood(){
       Food food = new Food("1","木桶饭",12.6,"有点咸","http://XXX.com");
       Product product = new Product("热销榜","1",food);
       JsonModel jsonModel = new JsonModel("0","成功",product);
       System.out.println(jsonModel);
       return jsonModel;
   }

   @PutMapping("/update")
   public JsonModel updateFood(){
       Food food = new Food("2","西红柿炒蛋",15.6,"味道刚刚好","http://XX.com");
       Product product = new Product( "家常榜","2",food);
       JsonModel jsonModel = new JsonModel("0","成功",product);
       System.out.println(jsonModel);
       return jsonModel;
   }

    @DeleteMapping("/delete")
    public JsonModel deleteFood(){
        Food food = new Food("3","皮蛋瘦肉粥",15.6,"有点儿咸","http://XX.com");
        Product product = new Product( "家常榜","2",food);
        JsonModel jsonModel = new JsonModel("0","成功",product);
        System.out.println(jsonModel);
        return jsonModel;
    }

    @GetMapping("/query")
    public JsonModel queryFood(){
        Food food = new Food("4","小米粥",6.6,"味道挺好","http://XX.com");
        Product product = new Product( "家常榜","2",food);
        JsonModel jsonModel = new JsonModel("0","成功",product);
        System.out.println(jsonModel);
        return jsonModel;
    }
}

