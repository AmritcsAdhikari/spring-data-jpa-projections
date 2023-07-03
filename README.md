# spring-data-jpa-projections

---

## Dynamic Projections
- In this case findBy(___) method return type is decided at runtime (i.e It is Generics).

### Syntax ?
```agsl
    <T> List<T> findBy___(...,Class<T>clz);
```
***Note**> `T` is the child interface Type, provided at runtime.



---
`main` branch - `No Projection`

Query Fired- `select p1_0.product_id,p1_0.product_code,p1_0.product_name,p1_0.product_price from product p1_0 where p1_0.product_code=?`

---
`static-interface` branch - `Static Projection`

Query Fired- `select p1_0.product_id,p1_0.product_name,p1_0.product_code from product p1_0 where p1_0.product_code=?`

---

`dynamic-interface` branch - `Dynamic Projection`

Query Fired- `select p1_0.product_name,p1_0.product_price from product p1_0 where p1_0.product_code=?`

---