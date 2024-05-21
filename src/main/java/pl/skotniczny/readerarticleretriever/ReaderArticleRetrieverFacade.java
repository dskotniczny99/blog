package pl.skotniczny.readerarticleretriever;

public class ReaderArticleRetrieverFacade {

    public ArticleDto retrieveById(long id) {

        return ArticleDto.builder()
                .id(1L)
                .header("Jak zostać programistą")
                .content("5 kroków: 1, 2, 3, 4, 5")
                .category("IT")
                .build();
    }
}
