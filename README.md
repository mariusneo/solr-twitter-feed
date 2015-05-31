Solr Twitter feed
==============================================


A very simple project used to try out Solr functionalities on searching for tweets.

Real data is imported from twitter via the solr-tweets-importer project into the Solr server. 
*solr-tweets-importer* is a simple spring-boot project that makes use of the stream functionality 
exposed by twitter4j library.

Details on how to have the Solr server up and running can be found in the solr-config/ directory.

If in the case of other projects a UI needs to be built even in the case of small home projects for 
visualizing the data, in the case when Solr is used, Solr banana UI frontend can be used to make
some initial prototypes before jumping to build a frontend application.
Details on how to setup a banana dashboard for easily making tweet statistics can be found under the 
solr-banana-config/ directory.


Possible future steps :
- Exposing REST service functionality similar to the one from the Postgres backed 
[twitter-feed](https://github.com/mariusneo/twitter-feed) project
- Create a JMeter / gatling project for simulating a higher load on the webservice