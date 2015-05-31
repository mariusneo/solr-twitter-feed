package mg.solr.twitter.feed.config;


import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.impl.HttpSolrServer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.solr.repository.config.EnableSolrRepositories;

@Configuration
@EnableSolrRepositories(basePackages = { "mg.solr.twitter.feed.repository" }, multicoreSupport = true)
public class SolrConfig {

    @Bean
    public SolrServer solrServer(@Value("${solr.host}") String solrHost) {
        return new HttpSolrServer(solrHost);
    }

}