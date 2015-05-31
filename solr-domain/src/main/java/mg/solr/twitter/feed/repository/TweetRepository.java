package mg.solr.twitter.feed.repository;

import mg.solr.twitter.feed.domain.Tweet;
import org.springframework.data.solr.repository.SolrCrudRepository;

public interface TweetRepository extends SolrCrudRepository<Tweet, String> {
}