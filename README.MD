# Java-based Blog.
---
Provides RESTfull API for user&posts creating and managing.

Allow to register and creating new posts for users,
managing user accounts for administrators.

## Common structure
---

| --- | --- |
| Controller | Handle browser requests |
| Service | Business logic methods |
| Repository | Work with DB as with collections |
| Spring Data MongoDB | ODM |
| MongoDB | DB |

| --- | --- |
| Config | Configuration classes |
| Entity | Domain models |


## API reference
---
### Auth

* POST [/register]() - create new user from from data.
* POST [/login]() - try to authenticate and get access token.

---
### Users API

* GET       [/api/users/:user_login]() - retrieve user data.
* PUT       [/api/users/:user_login]() - replace user by new one.
* DELETE    [/api/users/:user_login]() - delete user.

#### Posts API

* POST      [/api/users/:user_login/posts/]() - create new post.
* PUT       [/api/users/:user_login/posts/:post_id]() - replace post by new one.
* DELETE    [/api/users/:user_login/posts/:post_id]() - delete post.

---
#### Admin API

* GET       [/api/users]() - retrieve all users.
* PATCH     [/api/users/:user_login]() - edit user.


