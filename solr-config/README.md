Solr configuration
=========================================================

The directory tweets_schema_configs is a config set based on the data_driven_schema_configs
which is provided with the Solr 5.1.0 default installation.
The twitter specific fields are added in the tweet_schema_configs (see tweets_schema_configs/schema.xml file).

Start the Solr server

```
SOLR_HOME $ bin/solr start
```

Create the tweets core

```
SOLR_HOME bin/solr create_core -c tweets -d path_to_tweets_schema_configs
```

