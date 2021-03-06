package es.urjccode.mastercloudapps.adcs.draughts.models;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
    DirectionTest.class,
    CoordinateTest.class,
    PieceTest.class,
    GameBuilderTest.class,
    InitialGameTest.class,
    IncorrectMovesPieceGameTest.class,
    CorrectMovesPieceGameTest.class,
    IsBlockedGameTest.class } )
public final class AllModelTest {
}
