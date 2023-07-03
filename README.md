# spring-data-jpa-projections

---

## Static Projections
- This concept is used for always fixed types of columns selection
  for multiple runs (or calls).

### How to implement ?

`Step 1:`  Define one child interface (inner interface) in Repository interface with any
name.OR Create one public interface & use that inside RepositoryInterface as DataType.

`Step 2:` Copy getter method (getMethods()) from model class to child
interface.

`Step 3:` Use that child Interface as ReturnType for findBy() findBy methods.

---

`main` branch - 

Query - `select p1_0.product_id,p1_0.product_code,p1_0.product_name,p1_0.product_price from product p1_0 where p1_0.product_code=?`

---

`static-interface` branch - 

Query - `select p1_0.product_id,p1_0.product_name,p1_0.product_code from product p1_0 where p1_0.product_code=?`
