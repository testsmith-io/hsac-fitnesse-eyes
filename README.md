# hsac-fitnesse-eyes
[![Maven Central](https://img.shields.io/maven-central/v/io.testsmith/hsac-fitnesse-eyes.svg?maxAge=86400)](https://mvnrepository.com/artifact/io.testsmith/hsac-fitnesse-eyes)

This project brings Applitools Eyes to FitNesse HSAC.

## Available commands

Keyword | 
------------ | 
|eyes open__appname__ __testname__                           |
|eyes set value __value__ for agent id                                                              |
|eyes set value __value__ for app name                                                              |
|eyes set value __value__ for baseline branch name                                                  |
|eyes set value __value__ for baseline env name                                                     |
|eyes set value __value__ for branch name                                                           |
|eyes set value __value__ for debug screenshots path                                                |
|eyes set value __value__ for debug screenshots prefix                                              |
|eyes set value __width__ x __height__ for explicit viewport size                    |
|eyes set value __boolvalue__ for force full page screenshot                                            |
|eyes set value __boolvalue__ for hide caret                                                            |
|eyes set value __boolvalue__ for hide scrollbars                                                       |
|eyes set value __value__ for host app                                                              |
|eyes set value __value__ for host os                                                               |
|eyes set value __boolvalue__ for ignore caret                                                          |
|eyes set value __boolvalue__ for is disabled                                                           |
|eyes set value __value__ for match level |content, exact, layout, layout2, none                                                          |
|eyes set value __value__ for match timeout                                                         |
|eyes set value __value__ for parent branch name                                                    |
|eyes set value __value__ for rotation                                                              |
|eyes set value __boolvalue__for save debug screenshots                                                |
|eyes set value __boolvalue__ for save diffs                                                            |
|eyes set value __boolvalue__ for save new tests                                                        |
|eyes set value __value__ for scale ratio                                                           |
|eyes set value __boolvalue__ for scroll to region                                                      |
|eyes set value __boolvalue__ for send dom                                                              |
|eyes set value __value__ for server url                                                            |
|eyes set value __value__ for stitch mode |css, scroll                                                          |
|eyes set value __value__for stitch overlap                                                        |
|eyes set value __width__ x __height__ for viewport size                             |
|eyes set value __value__ for wait before screenshots                                               |
|eyes get agent id                                                                            |
|eyes get api key                                                                             |
|eyes get app name                                                                            |
|eyes get baseline branch name                                                                |
|eyes get baseline env name                                                                   |
|eyes get batch                                                                               |
|eyes get branch name                                                                         |
|eyes get configuration                                                                       |
|eyes get debug screenshots path                                                              |
|eyes get debug screenshots prefix                                                            |
|eyes get device pixel ratio                                                                  |
|eyes get force full page screenshot                                                          |
|eyes get hide caret                                                                          |
|eyes get hide scrollbars                                                                     |
|eyes get host app                                                                            |
|eyes get host os                                                                             |
|eyes get ignore caret                                                                        |
|eyes get is disabled                                                                         |
|eyes get is open                                                                             |
|eyes get match timeout                                                                       |
|eyes get parent branch name                                                                  |
|eyes get proxy                                                                               |
|eyes get rotation                                                                            |
|eyes get save debug screenshots                                                              |
|eyes get save diffs                                                                          |
|eyes get save new tests                                                                      |
|eyes get scale ratio                                                                         |
|eyes get scroll to region                                                                    |
|eyes get server url                                                                          |
|eyes get stitch mode                                                                         |
|eyes get stitch overlap                                                                      |
|eyes get viewport size                                                                       |
|eyes get wait before screenshots                                                             |
|eyes is send dom                                                                             |
|eyes check element __place__                                                        |
|eyes check element __place__ and tag it __tagname__|
|eyes check element __place__ and tag it __tagname__ with match timeout __timeout__|
|eyes check region __place__ and tag it __tagname__                              |
|eyes check region __place__                                                                          |
|eyes check region __place__ and do not stitch content                                                 |
|eyes check region __place__ and tag it __tagname__                        |
|eyes check region __place__ and tag it __tagname__ and do not stitch content                     |
|eyes check region __place__ and tag it __tagname__ with match timeout __timeout__                    |
|eyes check region __place__ and tag it __tagname__ with match timeout __timeout__ and do not stitch content|
|eyes check window                                                                                                                  |
|eyes check window and tag it __tagname__                                                                   |
|eyes check window fullpage and tag it __tagname__                                                                        |
|eyes check window and tag it __tagname__ with match timeout __timeout__                                                    |
|eyes close async                                                                                                                   |

## How to use it?

In the setup you need to set the key, like this:

~~~
|eyes set value|!-key-!|for api key|
~~~

A testscript can look like this:

~~~
|script                                      |
|open      |${URL}                           |
|eyes open;|Hackathon app 0.1|Form components|
|eyes check window                           |
|eyes close async                            |
|eyes get results                            |
~~~
