package com.path_studio.moviecatalogue.util

import com.path_studio.moviecatalogue.data.MovieEntity
import com.path_studio.moviecatalogue.data.TvShowEntity
import com.path_studio.moviecatalogue.data.TvShowSessionEntity

object DataDummy {
    fun generateDummyMovie(): List<MovieEntity> {

        val movies = ArrayList<MovieEntity>()

        movies.add(
            MovieEntity(
                399566,
                "Godzilla vs. Kong",
                "In a time when monsters walk the Earth, humanity’s fight for its future sets Godzilla and Kong on " +
                        "a collision course that will see the two most powerful forces of nature on the planet collide in a " +
                        "spectacular battle for the ages.",
                "03/24/2021",
                arrayListOf("Action", "Science Fiction"),
                113,
                83.0,
                "https://www.themoviedb.org/t/p/w533_and_h300_bestv2/inJjDhCjfhh3RtrJWBmmDqeuSYC.jpg",
                "https://www.themoviedb.org/t/p/w220_and_h330_face/pgqgaUx1cJb5oZQQ5v0tNARCeBp.jpg",
                "https://www.youtube.com/watch?v=odM92ap8_c0"
            )
        )

        movies.add(
            MovieEntity(
                791373,
                "Zack Snyder's Justice League",
                "Determined to ensure Superman's ultimate sacrifice was not in vain, Bruce Wayne aligns forces with Diana Prince with " +
                        "plans to recruit a team of metahumans to protect the world from an approaching threat of catastrophic proportions.",
                "03/18/2021",
                arrayListOf("Action", "Adventure", "Fantasy", "Science Fiction"),
                242,
                85.0,
                "https://www.themoviedb.org/t/p/w533_and_h300_bestv2/pcDc2WJAYGJTTvRSEIpRZwM3Ola.jpg",
                "https://www.themoviedb.org/t/p/w220_and_h330_face/tnAuB8q5vv7Ax9UAEje5Xi4BXik.jpg",
                "https://www.youtube.com/watch?v=vM-Bja2Gy04"
            )
        )

        movies.add(
            MovieEntity(
                527774,
                "Raya and the Last Dragon",
                "Long ago, in the fantasy world of Kumandra, humans and dragons lived together in harmony. But when an evil force threatened the land, " +
                        "the dragons sacrificed themselves to save humanity. Now, 500 years later, that same evil has returned and it’s up to a lone warrior, " +
                        "Raya, to track down the legendary last dragon to restore the fractured land and its divided people.",
                "03/03/2021",
                arrayListOf("Animation", "Adventure", "Fantasy", "Family", "Action"),
                107,
                83.0,
                "https://www.themoviedb.org/t/p/w533_and_h300_bestv2/7prYzufdIOy1KCTZKVWpjBFqqNr.jpg",
                "https://www.themoviedb.org/t/p/w220_and_h330_face/lPsD10PP4rgUGiGR4CCXA6iY0QQ.jpg",
                "https://www.youtube.com/watch?v=9BPMTr-NS9s"
            )
        )

        movies.add(
            MovieEntity(
                460465,
                "Mortal Kombat",
                "Washed-up MMA fighter Cole Young, unaware of his heritage, and hunted by Emperor Shang Tsung's best warrior, " +
                        "Sub-Zero, seeks out and trains with Earth's greatest champions as he prepares to stand against the enemies of " +
                        "Outworld in a high stakes battle for the universe.",
                "04/14/2021",
                arrayListOf("Adventure", "Fantasy", "Action"),
                110,
                74.0,
                "https://www.themoviedb.org/t/p/w533_and_h300_bestv2/9yBVqNruk6Ykrwc32qrK2TIE5xw.jpg",
                "https://www.themoviedb.org/t/p/w220_and_h330_face/8yhtzsbBExY8mUct2GOk4LDDuGH.jpg",
                "https://www.youtube.com/watch?v=jBa_aHwCbC4"
            )
        )

        movies.add(
            MovieEntity(
                464052,
                "Wonder Woman 1984",
                "A botched store robbery places Wonder Woman in a global battle against a powerful and mysterious " +
                        "ancient force that puts her powers in jeopardy.",
                "12/25/2020",
                arrayListOf("Adventure", "Fantasy", "Action"),
                151,
                68.0,
                "https://www.themoviedb.org/t/p/w533_and_h300_bestv2/srYya1ZlI97Au4jUYAktDe3avyA.jpg",
                "https://www.themoviedb.org/t/p/w220_and_h330_face/8UlWHLMpgZm9bx6QYh0NFoq67TZ.jpg",
                "https://www.youtube.com/watch?v=sfM7_JLk-84"
            )
        )

        movies.add(
            MovieEntity(
                    587996,
                "Below Zero",
                "When a prisoner transfer van is attacked, the cop in charge must fight those inside and outside while dealing with a " +
                        "silent foe: the icy temperatures.",
                "01/29/2021",
                arrayListOf("Action", "Crime", "Thriller"),
                106,
                64.0,
                "https://www.themoviedb.org/t/p/w533_and_h300_bestv2/6TPZSJ06OEXeelx1U1VIAt0j9Ry.jpg",
                "https://www.themoviedb.org/t/p/w220_and_h330_face/dWSnsAGTfc8U27bWsy2RfwZs0Bs.jpg",
                "https://www.youtube.com/watch?v=UCLz92vUYJY"
            )
        )

        movies.add(
            MovieEntity(
                632357,
                "The Unholy",
                "Alice, a young hearing-impaired girl who, after a supposed visitation from the Virgin Mary, " +
                        "is inexplicably able to hear, speak and heal the sick. As word spreads and people from near and " +
                        "far flock to witness her miracles, a disgraced journalist hoping to revive his career visits the " +
                        "small New England town to investigate. When terrifying events begin to happen all around, he starts " +
                        "to question if these phenomena are the works of the Virgin Mary or something much more sinister.",
                "03/31/2021",
                arrayListOf("Horror"),
                99,
                59.0,
                "https://www.themoviedb.org/t/p/w533_and_h300_bestv2/zDq2pwPyt4xwSFHKUoNN2LohDWj.jpg",
                "https://www.themoviedb.org/t/p/w220_and_h330_face/b4gYVcl8pParX8AjkN90iQrWrWO.jpg",
                "https://www.youtube.com/watch?v=NmQiJPLYzPI"
            )
        )

        movies.add(
            MovieEntity(
                615678,
                "Thunder Force",
                "In a world where supervillains are commonplace, two estranged childhood best friends " +
                        "reunite after one devises a treatment that gives them powers to protect their city.",
                "04/09/2021",
                arrayListOf("Action", "Adventure", "Comedy", "Fantasy"),
                107,
                58.0,
                "https://www.themoviedb.org/t/p/w533_and_h300_bestv2/nvghkcf0NQno5OanZXlBhqv2cOL.jpg",
                "https://www.themoviedb.org/t/p/w220_and_h330_face/279yOM4OQREL36B3SECnRxoB4MZ.jpg",
                "https://www.youtube.com/watch?v=qnx6-YLXFwg"
            )
        )

        movies.add(
            MovieEntity(
                508442,
                "Soul",
                "Joe Gardner is a middle school teacher with a love for jazz music. After a successful gig at the Half " +
                        "Note Club, he suddenly gets into an accident that separates his soul from his body and is transported " +
                        "to the You Seminar, a center in which souls develop and gain passions before being transported to a " +
                        "newborn child. Joe must enlist help from the other souls-in-training, like 22, a soul who has spent eons " +
                        "in the You Seminar, in order to get back to Earth.",
                "12/25/2020",
                arrayListOf("Family", "Animation", "Comedy", "Drama", "Music", "Fantasy"),
                101,
                83.0,
                "https://www.themoviedb.org/t/p/w533_and_h300_bestv2/kf456ZqeC45XTvo6W9pW5clYKfQ.jpg",
                "https://www.themoviedb.org/t/p/w220_and_h330_face/hm58Jw4Lw8OIeECIq5qyPYhAeRJ.jpg",
                "https://www.youtube.com/watch?v=4TojlZYqPUo"
            )
        )

        movies.add(
            MovieEntity(
                495764,
                "Birds of Prey (and the Fantabulous Emancipation of One Harley Quinn)",
                "Harley Quinn joins forces with a singer, an assassin and a police " +
                        "detective to help a young girl who had a hit placed on her after she " +
                        "stole a rare diamond from a crime lord.",
                "02/07/2020",
                arrayListOf("Action", "Crime"),
                109,
                71.0,
                "https://www.themoviedb.org/t/p/w533_and_h300_bestv2/jiqD14fg7UTZOT6qgvzTmfRYpWI.jpg",
                "https://www.themoviedb.org/t/p/w220_and_h330_face/h4VB6m0RwcicVEZvzftYZyKXs6K.jpg",
                "https://www.youtube.com/watch?v=ptLZlrE8MrQ"
            )
        )

        movies.add(
            MovieEntity(
                539885,
                "Ava",
                "A black ops assassin is forced to fight for her own survival after a job goes dangerously wrong.",
                "09/25/2020",
                arrayListOf("Action", "Crime" ,"Drama", "Thriller"),
                97,
                57.0,
                "https://www.themoviedb.org/t/p/w533_and_h300_bestv2/54yOImQgj8i85u9hxxnaIQBRUuo.jpg",
                "https://www.themoviedb.org/t/p/w220_and_h330_face/qzA87Wf4jo1h8JMk9GilyIYvwsA.jpg",
                "https://www.youtube.com/watch?v=ozUuAcGOhPs"
            )
        )

        movies.add(
            MovieEntity(
                475557,
                "Joker",
                "During the 1980s, a failed stand-up comedian is driven insane and turns to a " +
                        "life of crime and chaos in Gotham City while becoming an infamous psychopathic crime figure.",
                "10/02/2019",
                arrayListOf("Crime", "Thriller", "Drama"),
                122,
                82.0,
                "https://www.themoviedb.org/t/p/w533_and_h300_bestv2/f5F4cRhQdUbyVbB5lTNCwUzD6BP.jpg",
                "https://www.themoviedb.org/t/p/w220_and_h330_face/mZuAPY4ETMQPHhCXIcJ90kd6RaS.jpg",
                "https://www.youtube.com/watch?v=t433PEQGErc"
            )
        )

        return movies
    }

    fun generateTvShow(): List<TvShowEntity>{
        val tvShows = ArrayList<TvShowEntity>()

        tvShows.add(
                TvShowEntity(
                        88396,
                        "The Falcon and the Winter Soldier",
                        "Following the events of “Avengers: Endgame”, the Falcon, Sam Wilson and the Winter Soldier, " +
                                "Bucky Barnes team up in a global adventure that tests their abilities, and their patience.",
                        arrayListOf("Sci-Fi & Fantasy", "Action & Adventure", "Drama", "War & Politics"),
                        79.0,
                        50,
                        arrayListOf(
                                TvShowSessionEntity(
                                        88396,
                                        1,
                                        "March 19, 2021",
                                        6,
                                        "-",
                                        "https://www.themoviedb.org/t/p/w260_and_h390_bestv2/fIT6Y6O3cUX1X8qY8pZgzEvxUDQ.jpg"
                                )
                        ),
                        "https://www.themoviedb.org/t/p/w1066_and_h600_bestv2/b0WmHGc8LHTdGCVzxRb3IBMur57.jpg",
                        "https://www.themoviedb.org/t/p/w440_and_h660_face/6kbAMLteGO8yyewYau6bJ683sw7.jpg",
                        "https://www.youtube.com/watch?v=62EB4JniuTc&t=4s"
                )
        )

        tvShows.add(
                TvShowEntity(
                        71712,
                        "The Good Doctor",
                        "A young surgeon with Savant syndrome is recruited into the surgical unit of a prestigious hospital. " +
                                "The question will arise: can a person who doesn't have the ability to relate to people actually save their lives",
                        arrayListOf("Drama"),
                        86.0,
                        43,
                        arrayListOf(
                                TvShowSessionEntity(
                                        71712,
                                        1,
                                        "September 25, 2017",
                                        18,
                                        "-",
                                        "https://www.themoviedb.org/t/p/w260_and_h390_bestv2/hiNyjUSTFrbMv3Sc0CxNW2o39az.jpg"
                                ),
                                TvShowSessionEntity(
                                        71712,
                                        2,
                                        "September 24, 2018",
                                        18,
                                        "Dr. Shaun Murphy’s world has begun to expand as he continues to work harder than he ever has before, " +
                                                "navigating his new environment and relationships to prove to his colleagues at the prestigious St. Bonaventure " +
                                                "Hospital’s surgical unit that his extraordinary medical gifts will save lives.",
                                        "https://www.themoviedb.org/t/p/w260_and_h390_bestv2/sIq4SFloM0JSeRNAQVqb5g5zAng.jpg"
                                ),
                                TvShowSessionEntity(
                                        71712,
                                        3,
                                        "September 23, 2019",
                                        20,
                                        "Dr. Shaun Murphy continues to use his extraordinary medical gifts at St. Bonaventure Hospital’s surgical unit. " +
                                                "As his friendships deepen, Shaun tackles the world of dating for the first time and continues to work harder than he " +
                                                "ever has before.",
                                        "https://www.themoviedb.org/t/p/w260_and_h390_bestv2/8QFssOwaWZ3eB60cGwDpfrZBscv.jpg"
                                ),
                                TvShowSessionEntity(
                                        71712,
                                        4,
                                        "November 2, 2020",
                                        15,
                                        "Dr. Shaun Murphy continues to use his extraordinary medical gifts at St. Bonaventure Hospital’s surgical unit. " +
                                                "As his romantic relationship with Lea deepens, he will also face new responsibilities as a fourth-year resident when he " +
                                                "is put in charge of supervising a new set of residents that will test him in ways he cannot predict. Meanwhile, the team " +
                                                "must deal with the uncertainty and pressure that the COVID-19 pandemic brings now that it has hit their hospital.",
                                        "https://www.themoviedb.org/t/p/w260_and_h390_bestv2/6tfT03sGp9k4c0J3dypjrI8TSAI.jpg"
                                )
                        ),
                        "https://www.themoviedb.org/t/p/w1066_and_h600_bestv2/mZjZgY6ObiKtVuKVDrnS9VnuNlE.jpg",
                        "https://www.themoviedb.org/t/p/w440_and_h660_face/6tfT03sGp9k4c0J3dypjrI8TSAI.jpg",
                        "https://www.youtube.com/watch?v=fYlZDTru55g"
                )

        )

        tvShows.add(
                TvShowEntity(
                        60735,
                        "The Flash",
                        "After a particle accelerator causes a freak storm, CSI Investigator Barry Allen is " +
                                "struck by lightning and falls into a coma. Months later he awakens with the power of super " +
                                "speed, granting him the ability to move through Central City like an unseen guardian angel. " +
                                "Though initially excited by his newfound powers, Barry is shocked to discover he is not the " +
                                "only \"meta-human\" who was created in the wake of the accelerator explosion -- and not everyone " +
                                "is using their new powers for good. Barry partners with S.T.A.R. Labs and dedicates his life " +
                                "to protect the innocent. For now, only a few close friends and associates know that Barry is literally " +
                                "the fastest man alive, but it won't be long before the world learns what Barry Allen has become...The Flash.",
                        arrayListOf("Drama", "Sci-Fi & Fantasy"),
                        77.0,
                        44,
                        arrayListOf(
                                TvShowSessionEntity(
                                        60735,
                                        1,
                                        "October 7, 2014",
                                        23,
                                        "When an unexpected accident at the S.T.A.R. Labs Particle Accelerator facility strikes Barry, " +
                                                "he finds himself suddenly charged with the incredible power to move at super speeds. While Barry has " +
                                                "always been a hero in his soul, his newfound powers have finally given him the ability to act like one. " +
                                                "With the help of the research team at S.T.A.R. Labs, Barry begins testing the limits of his evolving powers " +
                                                "and using them to stop crime. With a winning personality and a smile on his face, Barry Allen — aka The Flash " +
                                                "— is finally moving forward in life … very, very fast!",
                                        "https://www.themoviedb.org/t/p/w260_and_h390_bestv2/A3H6pewHfoy2bXmNhvycOe0xzlC.jpg"
                                ),
                                TvShowSessionEntity(
                                        60735,
                                        2,
                                        "October 6, 2015",
                                        23,
                                        "Following the dramatic events of season 1, Team Flash quickly turns their attention to a threat high above " +
                                                "Central City. Armed with the heart of a hero and the ability to move at super speeds, will Barry be able to save his " +
                                                "city from impending doom?",
                                        "https://www.themoviedb.org/t/p/w260_and_h390_bestv2/8xWZPVX1cv9V5YD1RPeLj9QZDE9.jpg"
                                ),
                                TvShowSessionEntity(
                                        60735,
                                        3,
                                        "October 4, 2016",
                                        23,
                                        "Forensic scientist Barry Allen, aka The Flash, is living his dream life. His parents are alive. He's dating beautiful, " +
                                                "smart Iris West. And he's able to stand back and let the new speedster in town, Kid Flash, step in to protect Central City. " +
                                                "But the better Barry's life gets, the more dangerous it becomes. His nemesis, Reverse Flash, warns Barry of serious repercussions " +
                                                "if he remains in the alternate Flashpoint universe: In addition to memory loss, his powers will fade. When disaster strikes, " +
                                                "Barry must decide whether to continue life as Barry Allen or return to his universe as The Flash. As Barry deals with his identity " +
                                                "crisis, he and the S.T.A.R. Labs team fight off lethal threats from the God of Speed, Savitar.",
                                        "https://www.themoviedb.org/t/p/w260_and_h390_bestv2/rN1hgV8Ag3bZmkv33Udm93hIxQp.jpg"
                                ),
                                TvShowSessionEntity(
                                        60735,
                                        4,
                                        "October 10, 2017",
                                        23,
                                        "The mission of Barry Allen, aka The Flash, is once more to protect Central City from metahuman threats. But with Barry " +
                                                "trapped in the Speed Force, this mission falls to his family – Detective Joe West; fiancée Iris West; and Wally West/Kid Flash –" +
                                                " and the team at S.T.A.R. Labs: Caitlin Snow/Killer Frost, Cisco Ramon/Vibe and brilliant scientist Harrison Wells. When a powerful" +
                                                " villain threatens to level the city unless The Flash appears, Cisco risks everything to free Barry. But this is only the first " +
                                                "move in a deadly game with Clifford DeVoe, aka The Thinker, a mastermind who’s always ten steps ahead of Barry, no matter how fast " +
                                                "Barry runs.",
                                        "https://www.themoviedb.org/t/p/w260_and_h390_bestv2/zBF3wcUp3SgnlYNOXQeaDg5XfTu.jpg"
                                ),
                                TvShowSessionEntity(
                                        60735,
                                        5,
                                        "October 9, 2018",
                                        22,
                                        "Barry Allen and his new wife, Iris West, finally settling into married life when they're visited by Nora West-Allen, their " +
                                                "speedster daughter from the future. Nora's arrival brings to light the legacy every member of Team Flash will leave years from now, " +
                                                "causing many to question who they are today. And while Nora idolizes Barry, she holds a mysterious grudge against Iris. As Team Flash " +
                                                "adjusts to the next generation of speedster, they discover Nora's presence has triggered the arrival of the most ruthless, vicious and " +
                                                "relentless villain they have ever faced: Cicada!",
                                        "https://www.themoviedb.org/t/p/w260_and_h390_bestv2/z3CqL2vnjgLuefOiR5AYD9Tf91S.jpg"
                                ),
                                TvShowSessionEntity(
                                        60735,
                                        6,
                                        "October 8, 2019",
                                        19,
                                        "When Barry and Iris deal with loss of their daughter, the team faces their greatest threat yet - one that threatens to destroy all " +
                                                "of Central City; Killer Frost has a brush with death that will change her relationship with Caitlin. Faced with the news of his impending " +
                                                "death, Barry's resiliency suffers as he struggles to fight fate.",
                                        "https://www.themoviedb.org/t/p/w260_and_h390_bestv2/qDntRDRs5XohN4ClcV2SH9WlzpI.jpg"
                                ),
                                TvShowSessionEntity(
                                        60735,
                                        7,
                                        "March 2, 2021",
                                        9,
                                        "After a thrilling cliffhanger last season which saw Mirror Monarch victorious and still-at-large in Central City, The Flash must regroup in " +
                                                "order to stop her and find a way to make contact with his missing wife, Iris West-Allen. With help from the rest of Team Flash, Barry will ultimately " +
                                                "defeat Mirror Master. But in doing so, he’ll also unleash an even more powerful and devastating threat on Central City: one that threatens to tear his " +
                                                "team—and his marriage—apart.",
                                        "https://www.themoviedb.org/t/p/w260_and_h390_bestv2/lJA2RCMfsWoskqlQhXPSLFQGXEJ.jpg"
                                )
                        ),
                        "https://www.themoviedb.org/t/p/w1066_and_h600_bestv2/jC1KqsFx8ZyqJyQa2Ohi7xgL7XC.jpg",
                        "https://www.themoviedb.org/t/p/w440_and_h660_face/4YaerJEQtWrAMPwjDZArSxhL3fC.jpg",
                        "https://www.youtube.com/watch?v=Yj0l7iGKh8g&t=1s"
                )

        )

        tvShows.add(
                TvShowEntity(
                        63174,
                        "Lucifer",
                        "Bored and unhappy as the Lord of Hell, Lucifer Morningstar abandoned his throne and retired to Los Angeles, " +
                                "where he has teamed up with LAPD detective Chloe Decker to take down criminals. But the longer he's away from " +
                                "the underworld, the greater the threat that the worst of humanity could escape.",
                        arrayListOf("Crime", "Sci-Fi & Fantasy"),
                        85.0,
                        45,
                        arrayListOf(
                                TvShowSessionEntity(
                                        63174,
                                        1,
                                        "January 25, 2016",
                                        13,
                                        "Bored with being the Lord of Hell, the devil relocates to Los Angeles, where he opens a " +
                                                "nightclub and forms a connection with a homicide detective.",
                                        "https://www.themoviedb.org/t/p/w260_and_h390_bestv2/9qvNXKYqZEsYn3g3yn5tXQe0ceB.jpg"
                                ),
                                TvShowSessionEntity(
                                        63174,
                                        2,
                                        "September 19, 2016",
                                        18,
                                        "Lucifer returns for another season, but his devil-may-care attitude may soon need an adjustment: His mother is coming to town.",
                                        "https://www.themoviedb.org/t/p/w260_and_h390_bestv2/fTQzbse8HKh0z6UJbMUumdbZ8PX.jpg"
                                ),
                                TvShowSessionEntity(
                                        63174,
                                        3,
                                        "October 2, 2017",
                                        26,
                                        "As Lucifer struggles with an identity crisis, a gruff new police lieutenant shakes up the status quo with Chloe and the rest " +
                                                "of the LAPD.",
                                        "https://www.themoviedb.org/t/p/w260_and_h390_bestv2/4mKbrTqGg1daz3pDUgqd9ZSdZRt.jpg"
                                ),
                                TvShowSessionEntity(
                                        63174,
                                        4,
                                        "May 8, 2019",
                                        10,
                                        "As Chloe struggles to come to terms with Lucifer's disturbing revelation, a rogue priest sets out to stop a " +
                                                "long-rumored prophecy.",
                                        "https://www.themoviedb.org/t/p/w260_and_h390_bestv2/k9sLJE5geAmOCXOCbKnhSNND60J.jpg"
                                ),
                                TvShowSessionEntity(
                                        63174,
                                        5,
                                        "August 20, 2020",
                                        16,
                                        "Lucifer makes a tumultuous return to the land of the living in hopes of making things right with Chloe. A devil’s work is " +
                                                "never done.",
                                        "https://www.themoviedb.org/t/p/w260_and_h390_bestv2/4EYPN5mVIhKLfxGruy7Dy41dTVn.jpg"
                                )
                        ),
                        "https://www.themoviedb.org/t/p/w1066_and_h600_bestv2/mAXOCbZzvmDa6PCh5dcIPOB51Qc.jpg",
                        "https://www.themoviedb.org/t/p/w440_and_h660_face/4EYPN5mVIhKLfxGruy7Dy41dTVn.jpg",
                        "https://www.youtube.com/watch?v=X4bF_quwNtw"
                )

        )

        tvShows.add(
                TvShowEntity(
                        120168,
                        "Who Killed Sara?",
                        "Hell-bent on exacting revenge and proving he was framed for his sister's murder, Álex sets out to unearth much " +
                                "more than the crime's real culprit.",
                        arrayListOf("Drama", "Crime", "Mystery"),
                        79.0,
                        40,
                        arrayListOf(
                                TvShowSessionEntity(
                                        120168,
                                        1,
                                        "March 24, 2021",
                                        10,
                                        "-",
                                        "https://www.themoviedb.org/t/p/w260_and_h390_bestv2/o7uk5ChRt3quPIv8PcvPfzyXdMw.jpg"
                                ),
                                TvShowSessionEntity(
                                        120168,
                                        2,
                                        "May 19, 2021",
                                        10,
                                        "-",
                                        "https://www.themoviedb.org/t/p/w260_and_h390_bestv2/o7uk5ChRt3quPIv8PcvPfzyXdMw.jpg"
                                )
                        ),
                        "https://www.themoviedb.org/t/p/w1066_and_h600_bestv2/pLG4ihU1d2XkQbASQDjsFu9U7d9.jpg",
                        "https://www.themoviedb.org/t/p/w440_and_h660_face/o7uk5ChRt3quPIv8PcvPfzyXdMw.jpg",
                        "https://www.youtube.com/watch?v=hfikdvpj228&t=1s"
                )
        )

        tvShows.add(
                TvShowEntity(
                        95057,
                        "Superman & Lois",
                        "After years of facing megalomaniacal supervillains, monsters wreaking havoc on Metropolis, and alien invaders " +
                                "intent on wiping out the human race, The Man of Steel aka Clark Kent and Lois Lane come face to face with one of their " +
                                "greatest challenges ever: dealing with all the stress, pressures and complexities that come with being working parents " +
                                "in today's society.",
                        arrayListOf("Action & Adventure", "Sci-Fi & Fantasy"),
                        83.0,
                        64,
                        arrayListOf(
                                TvShowSessionEntity(
                                        95057,
                                        1,
                                        "February 23, 2021",
                                        7,
                                        "-",
                                        "https://www.themoviedb.org/t/p/w260_and_h390_bestv2/6SJppowm7cdQgLkvoTlnTUSbjr9.jpg"
                                )
                        ),
                        "https://www.themoviedb.org/t/p/w1066_and_h600_bestv2/gmbsR4SvYhhj4SvLAlTKxIkFxp9.jpg",
                        "https://www.themoviedb.org/t/p/w440_and_h660_face/6SJppowm7cdQgLkvoTlnTUSbjr9.jpg",
                        "https://www.youtube.com/watch?v=SJPJPUpNvDw&t=6s"
                )
        )

        tvShows.add(
                TvShowEntity(
                        85271,
                        "WandaVision",
                        "Wanda Maximoff and Vision—two super-powered beings living idealized suburban lives—begin to suspect that everything is not as it seems.",
                        arrayListOf("Sci-Fi & Fantasy", "Mystery", "Drama"),
                        84.0,
                        36,
                        arrayListOf(
                                TvShowSessionEntity(
                                        85271,
                                        1,
                                        "January 15, 2021",
                                        9,
                                        "-",
                                        "https://www.themoviedb.org/t/p/w260_and_h390_bestv2/2RBNHQxWwTDBTmShhdanYvbuS6x.jpg"
                                )
                        ),
                        "https://www.themoviedb.org/t/p/w1066_and_h600_bestv2/57vVjteucIF3bGnZj6PmaoJRScw.jpg",
                        "https://www.themoviedb.org/t/p/w440_and_h660_face/glKDfE6btIRcVB5zrjspRIs4r52.jpg",
                        "https://www.youtube.com/watch?v=62EB4JniuTc"
                )
        )

        tvShows.add(
                TvShowEntity(
                        71694,
                        "Snowfall",
                        "Los Angeles. 1983. A storm is coming and it's name is crack. Set against the infancy of the crack " +
                                "cocaine epidemic and its ultimate radical impact on the culture as we know it, the story follows numerous " +
                                "characters on a violent collision course.",
                        arrayListOf("Crime", "Drama"),
                        81.0,
                        42,
                        arrayListOf(
                                TvShowSessionEntity(
                                        71694,
                                        1,
                                        "July 5, 2017",
                                        10,
                                        "-",
                                        "https://www.themoviedb.org/t/p/w260_and_h390_bestv2/xeSNi6T65ODCUDWOLnI1OJ6RPDp.jpg"
                                ),
                                TvShowSessionEntity(
                                        71694,
                                        2,
                                        "July 19, 2018",
                                        10,
                                        "Season 2 enters 1984, with everyone working toward their ultimate goals of money, power, and " +
                                                "influence amid the Los Angeles crack cocaine epidemic.",
                                        "https://www.themoviedb.org/t/p/w260_and_h390_bestv2/2urnaBtljmz6pMixQlYbuwfD6ak.jpg"
                                ),
                                TvShowSessionEntity(
                                        71694,
                                        3,
                                        "July 10, 2019",
                                        10,
                                        "In Season 3, crack cocaine is spreading like wildfire through South Central Los Angeles, " +
                                                "continuing its path of destruction and changing the culture forever.",
                                        "https://www.themoviedb.org/t/p/w260_and_h390_bestv2/pMhdaEXiQuHNnmXt6tJ8OEOdcDw.jpg"
                                ),
                                TvShowSessionEntity(
                                        71694,
                                        4,
                                        "February 24, 2021",
                                        10,
                                        "In season four, Franklin tries to regain control over his business.",
                                        "https://www.themoviedb.org/t/p/w260_and_h390_bestv2/orvFrLzqSeW5qTFpfJEbPfHRPWg.jpg"
                                )
                        ),
                        "https://www.themoviedb.org/t/p/w1066_and_h600_bestv2/nRGZcByIb1urJrFXeBy1MdK0xsC.jpg",
                        "https://www.themoviedb.org/t/p/w440_and_h660_face/orvFrLzqSeW5qTFpfJEbPfHRPWg.jpg",
                        "https://www.youtube.com/watch?v=PmKgACCJtL8"
                )
        )

        tvShows.add(
                TvShowEntity(
                        1399,
                        "Game of Thrones",
                        "Seven noble families fight for control of the mythical land of Westeros. Friction between the houses leads to full-scale war. " +
                                "All while a very ancient evil awakens in the farthest north. Amidst the war, a neglected military order of misfits, the Night's " +
                                "Watch, is all that stands between the realms of men and icy horrors beyond.",
                        arrayListOf("Sci-Fi & Fantasy", "Drama", "Action & Adventure"),
                        84.0,
                        60,
                        arrayListOf(
                                TvShowSessionEntity(
                                        1399,
                                        1,
                                        "April 17, 2011",
                                        10,
                                        "Trouble is brewing in the Seven Kingdoms of Westeros. For the driven inhabitants of this visionary world, control of " +
                                                "Westeros' Iron Throne holds the lure of great power. But in a land where the seasons can last a lifetime, winter is " +
                                                "coming...and beyond the Great Wall that protects them, an ancient evil has returned. In Season One, the story centers on " +
                                                "three primary areas: the Stark and the Lannister families, whose designs on controlling the throne threaten a tenuous peace; " +
                                                "the dragon princess Daenerys, heir to the former dynasty, who waits just over the Narrow Sea with her malevolent brother " +
                                                "Viserys; and the Great Wall--a massive barrier of ice where a forgotten danger is stirring.",
                                        "https://www.themoviedb.org/t/p/w260_and_h390_bestv2/zwaj4egrhnXOBIit1tyb4Sbt3KP.jpg"
                                ),
                                TvShowSessionEntity(
                                        1399,
                                        2,
                                        "April 1, 2012",
                                        10,
                                        "The cold winds of winter are rising in Westeros...war is coming...and five kings continue their savage quest for control " +
                                                "of the all-powerful Iron Throne. With winter fast approaching, the coveted Iron Throne is occupied by the cruel Joffrey, " +
                                                "counseled by his conniving mother Cersei and uncle Tyrion. But the Lannister hold on the Throne is under assault on many fronts. " +
                                                "Meanwhile, a new leader is rising among the wildings outside the Great Wall, adding new perils for Jon Snow and the order of the " +
                                                "Night's Watch.",
                                        "https://www.themoviedb.org/t/p/w260_and_h390_bestv2/5tuhCkqPOT20XPwwi9NhFnC1g9R.jpg"
                                ),
                                TvShowSessionEntity(
                                        1399,
                                        3,
                                        "March 31, 2013",
                                        10,
                                        "Duplicity and treachery...nobility and honor...conquest and triumph...and, of course, dragons. In Season 3, family and loyalty are the " +
                                                "overarching themes as many critical storylines from the first two seasons come to a brutal head. Meanwhile, the Lannisters maintain their hold on " +
                                                "King's Landing, though stirrings in the North threaten to alter the balance of power; Robb Stark, King of the North, faces a major calamity as he " +
                                                "tries to build on his victories; a massive army of wildlings led by Mance Rayder march for the Wall; and Daenerys Targaryen--reunited with her " +
                                                "dragons--attempts to raise an army in her quest for the Iron Throne.",
                                        "https://www.themoviedb.org/t/p/w260_and_h390_bestv2/7d3vRgbmnrRQ39Qmzd66bQyY7Is.jpg"
                                ),
                                TvShowSessionEntity(
                                        1399,
                                        4,
                                        "April 6, 2014",
                                        10,
                                        "The War of the Five Kings is drawing to a close, but new intrigues and plots are in motion, and the surviving " +
                                                "factions must contend with enemies not only outside their ranks, but within.",
                                        "https://www.themoviedb.org/t/p/w260_and_h390_bestv2/dniQ7zw3mbLJkd1U0gdFEh4b24O.jpg"
                                ),
                                TvShowSessionEntity(
                                        1399,
                                        5,
                                        "April 12, 2015",
                                        10,
                                        "The War of the Five Kings, once thought to be drawing to a close, is instead entering a new and more chaotic phase. " +
                                                "Westeros is on the brink of collapse, and many are seizing what they can while the realm implodes, like a corpse making a feast for crows.",
                                        "https://www.themoviedb.org/t/p/w260_and_h390_bestv2/527sR9hNDcgVDKNUE3QYra95vP5.jpg"
                                ),
                                TvShowSessionEntity(
                                        1399,
                                        6,
                                        "April 6, 2014",
                                        10,
                                        "Following the shocking developments at the conclusion of season five, survivors from all parts of Westeros and Essos " +
                                                "regroup to press forward, inexorably, towards their uncertain individual fates. Familiar faces will forge new alliances to bolster " +
                                                "their strategic chances at survival, while new characters will emerge to challenge the balance of power in the east, west, north and south.",
                                        "https://www.themoviedb.org/t/p/w260_and_h390_bestv2/zvYrzLMfPIenxoq2jFY4eExbRv8.jpg"
                                ),
                                TvShowSessionEntity(
                                        1399,
                                        7,
                                        "July 16, 2017",
                                        7,
                                        "The long winter is here. And with it comes a convergence of armies and attitudes that have been brewing for years.",
                                        "https://www.themoviedb.org/t/p/w260_and_h390_bestv2/3dqzU3F3dZpAripEx9kRnijXbOj.jpg"
                                ),
                                TvShowSessionEntity(
                                        1399,
                                        8,
                                        "April 14, 2019",
                                        6,
                                        "The Great War has come, the Wall has fallen and the Night King's army of the dead marches towards Westeros. " +
                                                "The end is here, but who will take the Iron Throne?",
                                        "https://www.themoviedb.org/t/p/w260_and_h390_bestv2/39FHkTLnNMjMVXdIDwZN8SxYqD6.jpg"
                                )
                        ),
                        "https://www.themoviedb.org/t/p/w1066_and_h600_bestv2/suopoADq0k8YZr4dQXcU6pToj6s.jpg",
                        "https://www.themoviedb.org/t/p/w440_and_h660_face/u3bZgnGQ9T01sWNhyveQz0wH0Hl.jpg",
                        "https://www.youtube.com/watch?v=BpJYNVhGf1s&t=1s"
                )
        )

        tvShows.add(
                TvShowEntity(
                        44217,
                        "Vikings",
                        "The adventures of Ragnar Lothbrok, the greatest hero of his age. The series tells the sagas of Ragnar's band of Viking " +
                                "brothers and his family, as he rises to become King of the Viking tribes. As well as being a fearless warrior, Ragnar embodies " +
                                "the Norse traditions of devotion to the gods. Legend has it that he was a direct descendant of Odin, the god of war and warriors.",
                        arrayListOf("Sci-Fi & Fantasy", "Drama", "Action & Adventure"),
                        80.0,
                        44,
                        arrayListOf(
                                TvShowSessionEntity(
                                        44217,
                                        1,
                                        "March 3, 2013",
                                        9,
                                        "-",
                                        "https://www.themoviedb.org/t/p/w260_and_h390_bestv2/uYaskJzmBhBdvkitDTjlH6gj9Pt.jpg"
                                ),
                                TvShowSessionEntity(
                                        44217,
                                        2,
                                        "February 27, 2014",
                                        10,
                                        "Season two brings crises of faith, of power, of relationships. Brothers rise up against one another. Loyalties shift from friend " +
                                                "to foe, and unlikely alliances are formed in the name of supremacy. Ragnar’s indiscretions threaten his marriage to Lagertha, tearing " +
                                                "him and his beloved son apart. Plots are hatched, scores are settled, blood is spilled…all under the watchful eyes of the gods.",
                                        "https://www.themoviedb.org/t/p/w260_and_h390_bestv2/g2Pgu5Dae9P99yJs0xZQtEagA76.jpg"
                                ),
                                TvShowSessionEntity(
                                        44217,
                                        3,
                                        "February 19, 2015",
                                        10,
                                        "With the promise of new land from the English, Ragnar leads his people to an uncertain fate on the shores of Wessex. " +
                                                "King Ecbert has made many promises and it remains to be seen if he will keep them. But ever the restless wanderer, Ragnar is " +
                                                "searching for something more … and he finds it in the mythical city of Paris.",
                                        "https://www.themoviedb.org/t/p/w260_and_h390_bestv2/jICv5UxLDvUqCp1D2jAb0PSJWAw.jpg"
                                ),
                                TvShowSessionEntity(
                                        44217,
                                        4,
                                        "April 6, 2014",
                                        20,
                                        "A ferocious battle between the Vikings and the French eventually comes down to Ragnar against Rollo. The outcome will " +
                                                "seal the fate of the two brothers.",
                                        "https://www.themoviedb.org/t/p/w260_and_h390_bestv2/nHJHNRApy8vmTUvZx59l1f1GXzB.jpg"
                                ),
                                TvShowSessionEntity(
                                        44217,
                                        5,
                                        "November 29, 2017",
                                        20,
                                        "Season five begins with Ivar the Boneless asserting his leadership over the Great Heathen Army, while Lagertha reigns as Queen of Kattegat. " +
                                                "Ivar’s murder of his brother Sigurd sets the stage for vicious battles to come as Ragnar’s sons plot their next moves after avenging their father’s " +
                                                "death. Bjorn follows his destiny into the Mediterranean Sea and Floki who is suffering from the loss of his wife Helga, takes to the seas submitting " +
                                                "himself to the will of the Gods. This season is full of startling alliances and unbelievable betrayals as the Vikings fight to rule the world.",
                                        "https://www.themoviedb.org/t/p/w260_and_h390_bestv2/aFfwMjFhb05O2mC5hCfoEPPJ8xL.jpg"
                                ),
                                TvShowSessionEntity(
                                        44217,
                                        6,
                                        "December 4, 2019",
                                        20,
                                        "The final season finds Bjorn now the king of Kattegat, while Ivar is a fugitive in Russia and Lagertha plans a peaceful retirement " +
                                                "to a country farm.",
                                        "https://www.themoviedb.org/t/p/w260_and_h390_bestv2/3h0EDCz4eIefTUxHZaNaYwcRw47.jpg"
                                )
                        ),
                        "https://www.themoviedb.org/t/p/w1066_and_h600_bestv2/aq2yEMgRQBPfRkrO0Repo2qhUAT.jpg",
                        "https://www.themoviedb.org/t/p/w440_and_h660_face/bQLrHIRNEkE3PdIWQrZHynQZazu.jpg",
                        "https://www.youtube.com/watch?v=7rcozIVtujw"
                )
        )

        tvShows.add(
                TvShowEntity(
                        114695,
                        "Marvel Studios: Legends",
                        "Revisit the epic heroes, villains and moments from across the MCU in preparation for the stories still to come. " +
                                "Each dynamic segment feeds directly into the upcoming series — setting the stage for future events. This series weaves " +
                                "together the many threads that constitute the unparalleled Marvel Cinematic Universe.",
                        arrayListOf("Documentary"),
                        77.0,
                        8,
                        arrayListOf(
                                TvShowSessionEntity(
                                        114695,
                                        1,
                                        "January 8, 2021",
                                        6,
                                        "-",
                                        "https://www.themoviedb.org/t/p/w260_and_h390_bestv2/EpDuYIK81YtCUT3gH2JDpyj8Qk.jpg"
                                )
                        ),
                        "https://www.themoviedb.org/t/p/w1066_and_h600_bestv2/wAEWZm2pSopAbqE5dQWE0ET8aR5.jpg",
                        "https://www.themoviedb.org/t/p/w440_and_h660_face/EpDuYIK81YtCUT3gH2JDpyj8Qk.jpg",
                        "https://www.youtube.com/watch?v=lWQF6F81kbY"
                )
        )

        return tvShows
    }
}