package ulpgc.es.model;

import java.util.List;

public record Title(String id, Title.TitleType titleType, String primaryTitle) {

    public enum TitleType {
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