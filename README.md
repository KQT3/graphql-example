```
 http://localhost:8080/graphiql?path=/graphql
```

```
{
  getView {
    name
    users {
      name
      email,
      playlists {name}
    }
    playlists {
      name,
    	user {name}
    }
  }
}
```