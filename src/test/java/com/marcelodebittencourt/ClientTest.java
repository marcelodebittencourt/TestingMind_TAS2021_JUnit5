package com.marcelodebittencourt;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClientTest {

    @BeforeEach
    void init(TestInfo testInfo, TestReporter testReporter) {
        testReporter.publishEntry("Test: " + testInfo.getDisplayName() + ", Tags: " + testInfo.getTags());
    }

    @Test
    @DisplayName("Create a new client")
    @EnabledOnJre(JRE.JAVA_11)
    @Tag("Simple")
    void testCreateNewClient_ClientIsCreatedSuccessfully() {
        int id = 1;
        String name = "Marcelo";
        Client client = new Client(id, name);
        assertEquals(id, client.getId());
        assertEquals(name, client.getName());
    }

    @Test
    @DisplayName("Create a new client using lambda")
    @Tag("Simple")
    void testCreateNewClientUsingLambda_ClientIsCreatedSuccessfully() {
        int id = 1;
        String name = "Marcelo";
        Client client = new Client(id, name);
        assertAll(
                () -> assertEquals(id, client.getId()),
                () -> assertEquals(name, client.getName())
        );
    }


    @Nested
    @DisplayName("Boundary Tests")
    class BoundaryTest {

        @Test
        @DisplayName("Create a new client with big value size of id and name")
        @EnabledOnOs(OS.WINDOWS)
        void testCreateNewClientMaxId_NewClientCreateWithCorrectValues() {
            int id = 99999;
            String name = "Marcelo";
            Client client = new Client(id, name);
            assertEquals(id, client.getId());
            assertEquals(name, client.getName());
        }

        @Test
        @DisplayName("Create a new client with big value size of id and name")
        void testCreateNewClientMaxMaxName_NewClientCreateWithCorrectValues() {
            int id = 5;
            String name = "MarceloMarceloMarceloMarceloMarceloMarceloMarceloMarceloMarceloMarcelo";
            Client client = new Client(id, name);
            assertEquals(id, client.getId());
            assertEquals(name, client.getName());
        }

    }

    @ParameterizedTest
    @CsvFileSource(resources = "/clients.csv", numLinesToSkip = 1, delimiter = ';')
    void testNewClientDifferentValues(int id, String name){
        Client client = new Client(id, name);
        assertEquals(id, client.getId());
        assertEquals(name, client.getName());
    }
}
