# Examples of Postman Requests

## Programming Languages
```
[
    {
        "name": "Java",
        "firstAppearance": 1996,
        "inventor": "Gosling"
    },
    {
        "name": "C++",
        "firstAppearance": 1983,
        "inventor": "Stroustrup"
    },
    {
        "name": "Javascript",
        "firstAppearance": 1995,
        "inventor": "Eich"
    },
    {
        "name": "Go",
        "firstAppearance": 2009,
        "inventor": "Griesemer"
    }
]
```

## Request 1 - Insert Java
`POST` request JSON body on `http://localhost:5050/repo-prog-languages`:
```
{
    "name": "Java",
    "firstAppearance": 1996,
    "inventor": "Gosling"
}
```
Response: `201 - Created`

## Request 2 - Insert C++
`POST` request JSON body on `http://localhost:5050/repo-prog-languages`:
```
{
    "name": "C++",
    "firstAppearance": 1983,
    "inventor": "Stroustrup"
}
```
Response: `201 - Created`

## Request 3 - Insert Javascript
`POST` request JSON body on `http://localhost:5050/repo-prog-languages`:
```
{
    "name": "Javascript",
    "firstAppearance": 1995,
    "inventor": "Eich"
}
```
Response: `201 - Created`

## Request 4 - Insert Go
`POST` request JSON body on `http://localhost:5050/repo-prog-languages`:
```
{
    "name": "Go",
    "firstAppearance": 2009,
    "inventor": "Griesemer"
}
```
Response: `201 - Created`

## Request 5 - Get all programming languages (pagination, page: 0, size: 2)
`GET` request on `http://localhost:5050/repo-prog-languages?page=0&size=2` \
Response: `200 - OK`
```
{
    "_embedded": {
        "programmingLanguages": [
            {
                "name": "Java",
                "firstAppearance": 1996,
                "inventor": "Gosling",
                "_links": {
                    "self": {
                        "href": "http://localhost:5050/repo-prog-languages/1"
                    },
                    "programmingLanguage": {
                        "href": "http://localhost:5050/repo-prog-languages/1"
                    }
                }
            },
            {
                "name": "C++",
                "firstAppearance": 1983,
                "inventor": "Stroustrup",
                "_links": {
                    "self": {
                        "href": "http://localhost:5050/repo-prog-languages/2"
                    },
                    "programmingLanguage": {
                        "href": "http://localhost:5050/repo-prog-languages/2"
                    }
                }
            }
        ]
    },
    "_links": {
        "first": {
            "href": "http://localhost:5050/repo-prog-languages?page=0&size=2"
        },
        "self": {
            "href": "http://localhost:5050/repo-prog-languages?page=0&size=2"
        },
        "next": {
            "href": "http://localhost:5050/repo-prog-languages?page=1&size=2"
        },
        "last": {
            "href": "http://localhost:5050/repo-prog-languages?page=1&size=2"
        },
        "profile": {
            "href": "http://localhost:5050/profile/repo-prog-languages"
        }
    },
    "page": {
        "size": 2,
        "totalElements": 4,
        "totalPages": 2,
        "number": 0
    }
}
```

## Request 6 - Get all programming languages (pagination, page: 1, size: 2)
`GET` request on `http://localhost:5050/repo-prog-languages?page=1&size=2` \
Response: `200 - OK`
```
{
    "_embedded": {
        "programmingLanguages": [
            {
                "name": "Javascript",
                "firstAppearance": 1995,
                "inventor": "Eich",
                "_links": {
                    "self": {
                        "href": "http://localhost:5050/repo-prog-languages/3"
                    },
                    "programmingLanguage": {
                        "href": "http://localhost:5050/repo-prog-languages/3"
                    }
                }
            },
            {
                "name": "Go",
                "firstAppearance": 2009,
                "inventor": "Griesemer",
                "_links": {
                    "self": {
                        "href": "http://localhost:5050/repo-prog-languages/4"
                    },
                    "programmingLanguage": {
                        "href": "http://localhost:5050/repo-prog-languages/4"
                    }
                }
            }
        ]
    },
    "_links": {
        "first": {
            "href": "http://localhost:5050/repo-prog-languages?page=0&size=2"
        },
        "prev": {
            "href": "http://localhost:5050/repo-prog-languages?page=0&size=2"
        },
        "self": {
            "href": "http://localhost:5050/repo-prog-languages?page=1&size=2"
        },
        "last": {
            "href": "http://localhost:5050/repo-prog-languages?page=1&size=2"
        },
        "profile": {
            "href": "http://localhost:5050/profile/repo-prog-languages"
        }
    },
    "page": {
        "size": 2,
        "totalElements": 4,
        "totalPages": 2,
        "number": 1
    }
}
```

## Request 7 - Edit the inventor of one of the programming languages, entering your name
`PUT` request JSON body on `http://localhost:5050/repo-prog-languages/:id`:
```
{
    "name": "Java",
    "firstAppearance": 1996,
    "inventor": "Pietro"
}
```
Response: `200 - OK`

