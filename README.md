# hsac-fitnesse-eyes
[![Maven Central](https://img.shields.io/maven-central/v/io.testsmith/hsac-fitnesse-eyes.svg?maxAge=86400)](https://mvnrepository.com/artifact/io.testsmith/hsac-fitnesse-eyes)

This project brings Applitools Eyes to FitNesse HSAC.

## Available commands

Keyword | 
------------ | 
|eyes open_+appname+_ _+testname+_                           |
|eyes set value _+value+_ for agent id                                                              |
|eyes set value _+value+_ for app name                                                              |
|eyes set value _+value+_ for baseline branch name                                                  |
|eyes set value _+value+_ for baseline env name                                                     |
|eyes set value _+value+_ for branch name                                                           |
|eyes set value _+value+_ for debug screenshots path                                                |
|eyes set value _+value+_ for debug screenshots prefix                                              |
|eyes set value _+width+_ x _+height+_ for explicit viewport size                    |
|eyes set value _+boolvalue+_ for force full page screenshot                                            |
|eyes set value _+boolvalue+_ for hide caret                                                            |
|eyes set value _+boolvalue+_ for hide scrollbars                                                       |
|eyes set value _+value+_ for host app                                                              |
|eyes set value _+value+_ for host os                                                               |
|eyes set value _+boolvalue+_ for ignore caret                                                          |
|eyes set value _+boolvalue+_ for is disabled                                                           |
|eyes set value _+value+_ for match level |content, exact, layout, layout2, none                                                          |
|eyes set value _+value+_ for match timeout                                                         |
|eyes set value _+value+_ for parent branch name                                                    |
|eyes set value _+value+_ for rotation                                                              |
|eyes set value _+boolvalue+_for save debug screenshots                                                |
|eyes set value _+boolvalue+_ for save diffs                                                            |
|eyes set value _+boolvalue+_ for save new tests                                                        |
|eyes set value _+value+_ for scale ratio                                                           |
|eyes set value _+boolvalue+_ for scroll to region                                                      |
|eyes set value _+boolvalue+_ for send dom                                                              |
|eyes set value _+value+_ for server url                                                            |
|eyes set value _+value+_ for stitch mode |css, scroll                                                          |
|eyes set value _+value+_for stitch overlap                                                        |
|eyes set value _+width+_ x _+height+_ for viewport size                             |
|eyes set value _+value+_ for wait before screenshots                                               |
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
|eyes check element _+place+_                                                        |
|eyes check element _+place+_ and tag it _+tagname+_|
|eyes check element _+place+_ and tag it _+tagname+_ with match timeout _+timeout+_|
|eyes check region _+place+_ and tag it _+tagname+_                              |
|eyes check region _+place+_                                                                          |
|eyes check region _+place+_ and do not stitch content                                                 |
|eyes check region _+place+_ and tag it _+tagname+_                        |
|eyes check region _+place+_ and tag it _+tagname+_ and do not stitch content                     |
|eyes check region _+place+_ and tag it _+tagname+_ with match timeout _+timeout+_                    |
|eyes check region _+place+_ and tag it _+tagname+_ with match timeout _+timeout+_ and do not stitch content|
|eyes check window                                                                                                                  |
|eyes check window and tag it _+tagname+_                                                                   |
|eyes check window fullpage and tag it _+tagname+_                                                                        |
|eyes check window and tag it _+tagname+_ with match timeout _+timeout+_                                                    |
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
