package pl.skotniczny.readerarticleretriever;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ReaderArticleRetrieverFacadeTest {

    @Test
    @DisplayName("should return article with id 1 and content xxx")
    public void should_return_article_with_id_1_and_content_xxx() {
        // given
        ReaderArticleRetrieverFacade facade = new ReaderArticleRetrieverFacade();
        // when
        ArticleDto articleDto = facade.retrieveById(1);
        // then
        assert articleDto.id().equals(1L);
        assert articleDto.header().equals("Jak zostać programistą");
        assert articleDto.content().equals("5 kroków: 1, 2, 3, 4, 5");
        assert articleDto.category().equals("IT");

    }
}