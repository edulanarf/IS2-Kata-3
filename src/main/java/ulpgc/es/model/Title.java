package ulpgc.es.model;

import java.util.List;

public record Title(
        String id,
        Title.TitleType type,
        String primaryTitle,
        String originalTitle,
        List<Genre> genres
) {
    public enum Genre{
        Adult,
        Adventure,
        Animation,
        Biography,
        Comedy,
        Crime,
        Documentary,
        Fantasy,
        Family,
        History,
        Horror,
        Music,
        Musical,
        Mystery,
        News,
        Romance,
        Sport,
        Thriller,
        War,
        Western,
    }
    public enum TitleType{
        VideoGame,
        TvPilot,
        Movie,
        TvSeries,
        TvMiniSeries,
        Short,
        TvSpecial,
        TvShort,
        Video,
        TvMovie,
        TvEpisode
    }

}