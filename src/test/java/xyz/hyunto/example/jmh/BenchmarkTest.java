package xyz.hyunto.example.jmh;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BenchmarkTest {

    @Test
    public void executeJmhRunner() throws RunnerException {
        Options opt = new OptionsBuilder()
                .include("\\." + this.getClass().getSimpleName() + "\\.")
                .forks(1)
                .build();

        new Runner(opt).run();
    }

    @Benchmark
    public void benchmark_doNothing() {

    }

}
