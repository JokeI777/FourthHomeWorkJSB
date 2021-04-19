Реализовать два контроллера.  
Один контроллер должен в качестве ответа на GET запрос отдавать шаблон, в котором выводится список всех заголовков запроса. (то есть в итоге должен получиться один контроль с одним методом, который возвращает наименование шаблона)  
Второй контроллер должен принимать на вход JSON вида:  
```
{  
    "price": 125.0,  
    "info": {  
        "date": "2022-01-01"  
    }   
}  
```  
и отдавать его обратно. При этом в ответе должно быть свойство id:  
```
{
    "price": 125.0,
    "info": {
        "id": 123,
        "date": "2022-01-01"
    } 
}
```
Ссылки на полезную литературу как всегда в информационных ресурса  
![Image alt](https://github.com/JokeI777/FourthHomeWorkJSB/Success_Post.png)  
