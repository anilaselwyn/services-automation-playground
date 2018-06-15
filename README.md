<<<<<<< HEAD
# A playground for webservices automation
=======
# A playground for webservices automation

### Philisophy

The idea of this project is to extract and implement key components of an existing project so that I will have better idea of how they are implemented and work. The idea is to implement these features from scratch. With that said, following are the key components that have been identified that need to be implemented individually.

* Clone an available github repo (although its possible to clone folders from a repo using sparse clone, we are not going to do that)
* Read .json file
* Read node in .json file (we’re trying to read data within any number of nested level of json nodes)
* Decrypt the encrypted secret
* Build post request
  * url
  * body
  * headers
* Check for post response (valid/invalid)

NOTE: We don’t necessarily need to tie them together or make them work all together, they can work individually and still be thought of as working piece of code for the sake of this repo.

Sample Test File
```
{
    "id": "vod_cpc_1",
    "testDetails": {
        "name": "Video on demand",
        "description": "Test group to consume cpc service along with geo-location code to test video-on-demand"
    },
    "testCase": [
        {
            "url": "https://vod:blah/",
            "config": "https://github.com/blah/config",
            "body": {
                "parameters": {
                    "outMarketLat": 20,
                    "inMarketLat": 20
                }
            },
            "assertions": [
               {
                  "something": true,
                  "somethingElse": false,
               },
               {
                  "anotherThing": false
               }
            ],
            "preRequisite": [
               {
                  "type": "sikuli",
                  "geolocation": "on",
                  "location": "CA"
               },
               {
                  "type": "url",
                  "url": "https://someurl/invoke"
               }
            ]
        },
        {
            "url": "https://vod:blah/",
            "config": "https://github.com/blah/config",
            "body": {
                "parameters": {
                    "outMarketLat": 22,
                    "inMarketLat": 25
                }
            },
            "assertions": []
        }
    ]
}
```
>>>>>>> 28f731f9a492926ad3705f82ddcb398638712f3d
